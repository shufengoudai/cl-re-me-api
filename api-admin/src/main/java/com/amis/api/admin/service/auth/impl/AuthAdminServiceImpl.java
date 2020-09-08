package com.amis.api.admin.service.auth.impl;

import com.amis.api.admin.dao.auth.AuthAdminDao;
import com.amis.api.admin.entity.auth.AuthAdmin;
import com.amis.api.admin.exception.JsonException;
import com.amis.api.admin.req.auth.AuthAdminQueryRequest;
import com.amis.api.admin.service.BaseServiceImpl;
import com.amis.api.admin.service.auth.AuthAdminService;
import com.amis.api.common.enums.ResultEnum;
import com.amis.api.common.mapper.TUserDynamicSqlSupport;
import com.amis.api.common.mapper.TUserMapper;
import com.amis.api.common.model.TUser;
import org.apache.commons.lang3.StringUtils;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

@Service
public class AuthAdminServiceImpl extends BaseServiceImpl implements AuthAdminService {

  @Resource private AuthAdminDao authAdminDao;

  @Autowired private TUserMapper userMapper;

  @Override
  public List<AuthAdmin> listAdminPage(AuthAdminQueryRequest authAdminQueryRequest) {
    if (authAdminQueryRequest == null) {
      return Collections.emptyList();
    }
    SelectStatementProvider selectStatement =
        SqlBuilder.select(
                TUserDynamicSqlSupport.id,
                TUserDynamicSqlSupport.userName,
                TUserDynamicSqlSupport.userFullname,
                TUserDynamicSqlSupport.userMail,
                TUserDynamicSqlSupport.password,
                TUserDynamicSqlSupport.authority)
            .from(TUserDynamicSqlSupport.TUser)
            .build()
            .render(RenderingStrategies.MYBATIS3);
    List<TUser> users = userMapper.selectMany(selectStatement);
    List<AuthAdmin> admins = new ArrayList<AuthAdmin>();
    if (users.size() > 0) {
      for (TUser user : users) {
        AuthAdmin admin = new AuthAdmin();
        admin.setUsername(user.getUserName());
        admin.setEmail(user.getUserMail());
        admin.setId(user.getId());
        admins.add(admin);
      }
    }
    return admins;
  }

  @Override
  public AuthAdmin findByUserName(String userName) {

    SelectStatementProvider selectStatement =
        SqlBuilder.select(
                TUserDynamicSqlSupport.id,
                TUserDynamicSqlSupport.userName,
                TUserDynamicSqlSupport.userFullname,
                TUserDynamicSqlSupport.userMail,
                TUserDynamicSqlSupport.password,
                TUserDynamicSqlSupport.authority)
            .from(TUserDynamicSqlSupport.TUser)
            .where(TUserDynamicSqlSupport.userName, SqlBuilder.isEqualTo(userName))
            .and(TUserDynamicSqlSupport.logicalDelDiv, SqlBuilder.isEqualTo(0))
            .build()
            .render(RenderingStrategies.MYBATIS3);
    Optional<TUser> user = userMapper.selectOne(selectStatement);
    AuthAdmin admin = new AuthAdmin();
    if (user.isPresent()) {
      admin.setUsername(user.get().getUserName());
      admin.setEmail(user.get().getUserMail());
      admin.setId(user.get().getId());
      admin.setPassword(user.get().getPassword());
    }
    return admin;
  }

  /**
   * 根据id 获取需要的info
   *
   * @param id
   * @return
   */
  @Override
  public AuthAdmin findById(Object id) {
    SelectStatementProvider selectStatement =
        SqlBuilder.select(
                TUserDynamicSqlSupport.id,
                TUserDynamicSqlSupport.userName,
                TUserDynamicSqlSupport.userFullname,
                TUserDynamicSqlSupport.userMail,
                TUserDynamicSqlSupport.password,
                TUserDynamicSqlSupport.authority)
            .from(TUserDynamicSqlSupport.TUser)
            .where(TUserDynamicSqlSupport.id, SqlBuilder.isEqualTo(id))
            .and(TUserDynamicSqlSupport.logicalDelDiv, SqlBuilder.isEqualTo(0))
            .build()
            .render(RenderingStrategies.MYBATIS3);
    Optional<TUser> user = userMapper.selectOne(selectStatement);
    AuthAdmin admin = new AuthAdmin();
    if (user.isPresent()) {
      admin.setUsername(user.get().getUserName());
      admin.setEmail(user.get().getUserMail());
      admin.setId(user.get().getId());
      admin.setPassword(user.get().getPassword());
    }
    return admin;
  }

  /**
   * 根据 id 获取密码字段
   *
   * @param id
   * @return
   */
  @Override
  public AuthAdmin findPwdById(String id) {
    SelectStatementProvider selectStatement =
        SqlBuilder.select(
                TUserDynamicSqlSupport.id,
                TUserDynamicSqlSupport.userName,
                TUserDynamicSqlSupport.userFullname,
                TUserDynamicSqlSupport.userMail,
                TUserDynamicSqlSupport.password,
                TUserDynamicSqlSupport.authority)
            .from(TUserDynamicSqlSupport.TUser)
            .where(TUserDynamicSqlSupport.id, SqlBuilder.isEqualTo(UUID.fromString(id)))
            .and(TUserDynamicSqlSupport.logicalDelDiv, SqlBuilder.isEqualTo(0))
            .build()
            .render(RenderingStrategies.MYBATIS3);
    Optional<TUser> user = userMapper.selectOne(selectStatement);
    AuthAdmin admin = new AuthAdmin();
    if (user.isPresent()) {
      admin.setUsername(user.get().getUserName());
      admin.setEmail(user.get().getUserMail());
      admin.setId(user.get().getId());
      admin.setPassword(user.get().getPassword());
    }
    return admin;
  }

  /**
   * 新增
   *
   * @param authAdmin
   * @return
   */
  @Override
  public boolean insertAuthAdmin(AuthAdmin authAdmin) {

    if (authAdmin.getUsername() != null) {
      AuthAdmin byUserName = findByUserName(authAdmin.getUsername());
      if (byUserName != null && !StringUtils.isEmpty(byUserName.getUsername())) {
        throw new JsonException(ResultEnum.DATA_REPEAT, "当前用户已存在");
      }
    }
    TUser user = new TUser();
    user.setAuthority(0);
    user.setUserName(authAdmin.getUsername());
    user.setPassword(authAdmin.getPassword());
    user.setLogicalDelDiv(0);
    // user.setInsAccountId(insAccountId);
    user.setInsDtTime(new Date());
    int count = userMapper.insert(user);
    if (count > 0) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * 更新
   *
   * @param authAdmin
   * @return
   */
  @Override
  public boolean updateAuthAdmin(AuthAdmin authAdmin) {

    if (authAdmin.getId() == null) {
      return false;
    }
    // 当用户名不为空时，检查是否存在
    if (authAdmin.getUsername() != null) {
      AuthAdmin byUserName = findByUserName(authAdmin.getUsername());
      // 判断是否存在，剔除自己
      if (byUserName != null && !authAdmin.getId().equals(byUserName.getId())) {
        throw new JsonException(ResultEnum.DATA_REPEAT, "当前用户已存在");
      }
    }

    UpdateStatementProvider updateStatement = SqlBuilder
            .update(TUserDynamicSqlSupport.TUser).set(TUserDynamicSqlSupport.updAccountId)
            .equalTo(authAdmin.getId())
            .set(TUserDynamicSqlSupport.updDtTime).equalTo(new Date())
            .set(TUserDynamicSqlSupport.password).equalTo(authAdmin.getPassword())
            .set(TUserDynamicSqlSupport.logicalDelDiv).equalTo(0)
            .where(TUserDynamicSqlSupport.id,
                    isEqualTo(authAdmin.getId())).build()
            .render(RenderingStrategies.MYBATIS3);

    int count = userMapper.update(updateStatement);
    if (count > 0) {
      return true;
    } else {
      return false;
    }




//    TUser user = new TUser();
//    user.setAuthority(0);
//    user.setUserName(authAdmin.getUsername());
//    user.setPassword(authAdmin.getPassword());
//    user.setPosition(0);
//    user.setLogicalDelDiv(0);
//    // user.setInsAccountId(insAccountId);
//    user.setUpdDtTime(new Date());
//    InsertStatementProvider<TUser> insertStatement =
//        SqlBuilder.insert(user)
//            .into(TUserDynamicSqlSupport.TUser)
//            .map(TUserDynamicSqlSupport.id)
//            .toNull()
//            .build()
//            .render(RenderingStrategies.MYBATIS3);
//
//    int count = userMapper.insert(insertStatement);
//    if (count > 0) {
//      return true;
//    } else {
//      return false;
//    }
  }

  /**
   * 根据id删除
   *
   * @param id
   * @return
   */
  @Override
  public boolean deleteById(Long id) {
    return authAdminDao.deleteById(id);
  }
}
