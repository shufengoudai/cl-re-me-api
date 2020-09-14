package com.amis.api.admin.service.user.impl;

import com.amis.api.admin.constant.MessageConstant;
import com.amis.api.admin.dao.user.UserDao;
import com.amis.api.admin.entity.user.User;
import com.amis.api.admin.entity.user.UserWindow;
import com.amis.api.admin.exception.JsonException;
import com.amis.api.admin.req.user.PasswordChangeRequest;
import com.amis.api.admin.req.user.UserRequest;
import com.amis.api.admin.service.BaseServiceImpl;
import com.amis.api.admin.service.user.UserService;
import com.amis.api.admin.util.CacheUtils;
import com.amis.api.admin.util.LangUtil;
import com.amis.api.admin.util.MessageUtil;
import com.amis.api.admin.util.PasswordUtils;
import com.amis.api.common.constant.CacheConstant;
import com.amis.api.common.dto.PulldownDto;
import com.amis.api.common.enums.ResultEnum;
import com.amis.api.common.mapper.*;
import com.amis.api.common.model.TMemberProject;
import com.amis.api.common.model.TNotificationHistory;
import com.amis.api.common.model.TProject;
import com.amis.api.common.model.TUser;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

@Service
public class UserServiceImpl extends BaseServiceImpl implements UserService {

  @Resource
  private TProjectMapper projectMapper;

  @Resource
  private TUserMapper userMapper;

  @Resource
  private UserDao userDao;

  @Resource
  private TMemberProjectMapper memberProjectMapper;

  /**
   * 多表查询，检索用户加入的项目一览
   * @param userId
   * @return
   */
  @Override
  public List<PulldownDto> userProjectList(String userId) {
    SelectStatementProvider selectStatement =
        SqlBuilder.select(TProjectDynamicSqlSupport.id, TProjectDynamicSqlSupport.projectName)
            .from(TProjectDynamicSqlSupport.TProject)
            .where(TProjectDynamicSqlSupport.id,
                SqlBuilder.isIn(SqlBuilder.select(TMemberProjectDynamicSqlSupport.projectId)
                    .from(TMemberProjectDynamicSqlSupport.TMemberProject)
                    .where(TMemberProjectDynamicSqlSupport.userId,
                        SqlBuilder.isEqualTo(UUID.fromString(userId)))
                    .and(TMemberProjectDynamicSqlSupport.logicalDelDiv, SqlBuilder.isEqualTo(0))))
            .and(TProjectDynamicSqlSupport.logicalDelDiv, SqlBuilder.isEqualTo(0)).build()
            .render(RenderingStrategies.MYBATIS3);
    //根据用户id，检索用户加入的所有项目一览
    List<TProject> projects = projectMapper.selectMany(selectStatement);
    List<PulldownDto> res = new ArrayList<PulldownDto>();
    //数据转换成前台需要的格式
    if (projects.size() > 0) {
      for (TProject project : projects) {
        PulldownDto dto = new PulldownDto();
        dto.setLabel(project.getProjectName());
        dto.setValue(String.valueOf(project.getId()));
        res.add(dto);
      }
    }
    return res;
  }

  /**
   * user表，检索一览数据
   * @param companyId
   * @return
   */
  @Override
  public List<User> listUser(String companyId) {

    List<User> resList = userDao.listUser(UUID.fromString(companyId));
    return resList;
  }

  /**
   * user表，插入数据
   * @param data
   * @return
   */
  @Override
  public boolean setUser(UserRequest data) {
    //流程标志
    boolean res=false;
    //用户名check
    checkUserName(data.getUserName());

    TUser tUser = new TUser();
    BeanUtils.copyProperties(data,tUser);

    tUser.setInsDtTime(new Date());
    tUser.setUpdAccountId(tUser.getInsAccountId());
    tUser.setUpdDtTime(new Date());
    tUser.setLogicalDelDiv(0);
    tUser.setPassword(PasswordUtils.hashPassword(tUser.getPassword()));

    //插入用户
    InsertStatementProvider<TUser> insertStatement = SqlBuilder.insert(tUser)
            .into(TUserDynamicSqlSupport.TUser)
            .map(TUserDynamicSqlSupport.userName).toProperty("userName")
            .map(TUserDynamicSqlSupport.userFullname).toProperty("userFullname")
            .map(TUserDynamicSqlSupport.password).toProperty("password")
            .map(TUserDynamicSqlSupport.authority).toProperty("authority")
            .map(TUserDynamicSqlSupport.position).toProperty("position")
            .map(TUserDynamicSqlSupport.userMail).toProperty("userMail")
            .map(TUserDynamicSqlSupport.userTel).toProperty("userTel")
            .map(TUserDynamicSqlSupport.userDepart).toProperty("userDepart")
            .map(TUserDynamicSqlSupport.userSex).toProperty("userSex")
            .map(TUserDynamicSqlSupport.userNotify).toProperty("userNotify")
            .map(TUserDynamicSqlSupport.insAccountId).toProperty("insAccountId")
            .map(TUserDynamicSqlSupport.insDtTime).toProperty("insDtTime")
            .map(TUserDynamicSqlSupport.updAccountId).toProperty("updAccountId")
            .map(TUserDynamicSqlSupport.updDtTime).toProperty("updDtTime")
            .map(TUserDynamicSqlSupport.logicalDelDiv).toProperty("logicalDelDiv").build()
            .render(RenderingStrategies.MYBATIS3);
    userMapper.insert(insertStatement);

    return true;
  }

  /**
   * 用户名check
   * @param userName
   * @return
   */
  private void checkUserName(String userName){
    SelectStatementProvider selectStatementProvider = SqlBuilder
            .select(TUserDynamicSqlSupport.id)
            .from(TUserDynamicSqlSupport.TUser)
            .where(TUserDynamicSqlSupport.userName,isEqualTo(userName))
            .and(TUserDynamicSqlSupport.logicalDelDiv,isEqualTo(0)).build()
            .render(RenderingStrategies.MYBATIS3);
    Optional<TUser> optionalTUser = userMapper.selectOne(selectStatementProvider);
    if(optionalTUser.isPresent()){
      throw new JsonException(ResultEnum.DUPLICATE_USERNAME,
              MessageUtil.getMessage(MessageConstant.messageWarning,MessageConstant.duplicateUsername,
                      LangUtil.getLangFromRedis(httpServletRequest.getHeader(MessageConstant.token))));
    }

  }

  /**
   * user表，检索单条user数据
   * @param userId
   * @return
   */
  @Override
  public User userDetail(String userId) {
    User user = new User();
    SelectStatementProvider selectStatement = SqlBuilder
            .select(TUserDynamicSqlSupport.id
                  ,TUserDynamicSqlSupport.userName
                  ,TUserDynamicSqlSupport.userFullname
                  ,TUserDynamicSqlSupport.position
                  ,TUserDynamicSqlSupport.userMail
                  ,TUserDynamicSqlSupport.userTel
                  ,TUserDynamicSqlSupport.userDepart
                  ,TUserDynamicSqlSupport.userSex
                  ,TUserDynamicSqlSupport.userNotify
                  ,TUserDynamicSqlSupport.insAccountId
                  ,TUserDynamicSqlSupport.insDtTime
                  ,TUserDynamicSqlSupport.updAccountId
                  ,TUserDynamicSqlSupport.updDtTime
                  ,TUserDynamicSqlSupport.authority)
            .from(TUserDynamicSqlSupport.TUser)
            .where(TUserDynamicSqlSupport.id,isEqualTo(UUID.fromString(userId)))
            .and(TUserDynamicSqlSupport.logicalDelDiv,isEqualTo(0)).build()
            .render(RenderingStrategies.MYBATIS3);
    Optional<TUser> tUserOptional = userMapper.selectOne(selectStatement);
    if (tUserOptional.isPresent()) {
      BeanUtils.copyProperties(tUserOptional.get(),user);
    }
    return user;
  }

  /**
   * user表,更新user信息
   * @param data
   * @return
   */
  @Override
  public boolean updateUser(UserRequest data) {
    //流程标志
    boolean res = false;
    //判断用户名是否更改
    SelectStatementProvider statementProvider = SqlBuilder
            .select(TUserDynamicSqlSupport.userName)
            .from(TUserDynamicSqlSupport.TUser)
            .where(TUserDynamicSqlSupport.id,isEqualTo(data.getId()))
            .and(TUserDynamicSqlSupport.logicalDelDiv,isEqualTo(0)).build()
            .render(RenderingStrategies.MYBATIS3);
    //检索用户名
    Optional<TUser> tUser = userMapper.selectOne(statementProvider);
    //永明存在并且这次更新没有修改用户名
    if(tUser.isPresent() && tUser.get().getUserName().equals(data.getUserName())){
      //更新user信息
      res = userUpdate(data);
    }else{
      //判断用户名是否重复
      checkUserName(data.getUserName());
      //更新user信息
      res = userUpdate(data);
    }

    return res;
  }

  /**
   * user表，更新数据
   * @param data
   * @return
   */
  private boolean userUpdate(UserRequest data){
    //流程标志
    boolean res = false;
    TUser tUser = new TUser();
    BeanUtils.copyProperties(data,tUser);

    SelectStatementProvider selectStatement = SqlBuilder
            .select(TUserDynamicSqlSupport.updDtTime)
            .from(TUserDynamicSqlSupport.TUser)
            .where(TUserDynamicSqlSupport.id,isEqualTo(data.getId()))
            .and(TUserDynamicSqlSupport.logicalDelDiv,isEqualTo(0)).build()
            .render(RenderingStrategies.MYBATIS3);
    //检索更新时间
    Optional<TUser> tUserOptional = userMapper.selectOne(selectStatement);
    //检索到数据的时候
    if (tUserOptional.isPresent()) {
      //排他成功
      if (tUserOptional.get().getUpdDtTime().equals(tUser.getUpdDtTime())) {
        UpdateStatementProvider updateStatement = SqlBuilder
                .update(TUserDynamicSqlSupport.TUser)
                .set(TUserDynamicSqlSupport.userName).equalTo(tUser.getUserName())
                .set(TUserDynamicSqlSupport.userFullname).equalTo(tUser.getUserFullname())
                .set(TUserDynamicSqlSupport.position).equalTo(tUser.getPosition())
                .set(TUserDynamicSqlSupport.userMail).equalTo(tUser.getUserMail())
                .set(TUserDynamicSqlSupport.userTel).equalTo(tUser.getUserTel())
                .set(TUserDynamicSqlSupport.userDepart).equalTo(tUser.getUserDepart())
                .set(TUserDynamicSqlSupport.userSex).equalTo(tUser.getUserSex())
                .set(TUserDynamicSqlSupport.authority).equalTo(tUser.getAuthority())
                .set(TUserDynamicSqlSupport.userNotify).equalTo(tUser.getUserNotify())
                .set(TUserDynamicSqlSupport.updAccountId).equalTo(tUser.getInsAccountId())
                .set(TUserDynamicSqlSupport.updDtTime).equalTo(new Date())
                .where(TUserDynamicSqlSupport.id,isEqualTo(data.getId()))
                .and(TUserDynamicSqlSupport.logicalDelDiv,isEqualTo(0)).build()
                .render(RenderingStrategies.MYBATIS3);
        userMapper.update(updateStatement);
        //流程正常
        res = true;
        //排他失败
      } else {
        throw new JsonException(ResultEnum.EXCLUSION_ERROR,
                MessageUtil.getMessage(MessageConstant.messageInfo,MessageConstant.exclusionError,
                        LangUtil.getLangFromRedis(httpServletRequest.getHeader(MessageConstant.token))));
      }
      //检索不到，抛异常
    } else {
      throw new JsonException(ResultEnum.DATA_NOT,
              MessageUtil.getMessage(MessageConstant.messageWarning,MessageConstant.dataNot,
                      LangUtil.getLangFromRedis(httpServletRequest.getHeader(MessageConstant.token))));
    }
    return res;
  }

  /**
   * user表，修改密码
   * @param data
   * @return
   */
  @Override
  public boolean changePassword(PasswordChangeRequest data) {
    TUser tUser = new TUser();
    BeanUtils.copyProperties(data, tUser);
    tUser.setPassword(PasswordUtils.hashPassword(tUser.getPassword()));

    SelectStatementProvider selectStatement = SqlBuilder
            .select(TUserDynamicSqlSupport.updDtTime)
            .from(TUserDynamicSqlSupport.TUser)
            .where(TUserDynamicSqlSupport.id,isEqualTo(data.getId()))
            .and(TUserDynamicSqlSupport.logicalDelDiv,isEqualTo(0)).build()
            .render(RenderingStrategies.MYBATIS3);
    //检索更新时间
    Optional<TUser> tUserOptional = userMapper.selectOne(selectStatement);
    //数据存在的时候
    if (tUserOptional.isPresent()) {
      //排他成功
      if (tUserOptional.get().getUpdDtTime().equals(tUser.getUpdDtTime())) {
        UpdateStatementProvider updateStatement = SqlBuilder
                .update(TUserDynamicSqlSupport.TUser)
                .set(TUserDynamicSqlSupport.password).equalTo(tUser.getPassword())
                .set(TUserDynamicSqlSupport.updAccountId).equalTo(tUser.getInsAccountId())
                .set(TUserDynamicSqlSupport.updDtTime).equalTo(new Date())
                .where(TUserDynamicSqlSupport.id,isEqualTo(data.getId())).build()
                .render(RenderingStrategies.MYBATIS3);
        userMapper.update(updateStatement);
        //排他失败
      } else {
        throw new JsonException(ResultEnum.EXCLUSION_ERROR,
                MessageUtil.getMessage(MessageConstant.messageInfo,MessageConstant.exclusionError,
                        LangUtil.getLangFromRedis(httpServletRequest.getHeader(MessageConstant.token))));
      }
      //数据不存在的时候
    } else {
      throw new JsonException(ResultEnum.DATA_NOT,
              MessageUtil.getMessage(MessageConstant.messageWarning,MessageConstant.dataNot,
                      LangUtil.getLangFromRedis(httpServletRequest.getHeader(MessageConstant.token))));
    }
    return true;
  }


  @Override
  public User getUser(String id) {
    User user=userDao.getUser(UUID.fromString(id));
    return user;
  }

  @Override
  public List<UserWindow> getUserList() {
    return userDao.getUserList();
  }

}
