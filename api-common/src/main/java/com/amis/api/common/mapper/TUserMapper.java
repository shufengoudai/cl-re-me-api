package com.amis.api.common.mapper;

import static com.amis.api.common.mapper.TUserDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.amis.api.common.model.TUser;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface TUserMapper {

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.658286+08:00", comments = "Source Table: t_user")
    BasicColumn[] selectList = BasicColumn.columnList(id, userName, userFullname, password, authority, position,
            userMail, userTel, userDepart, userSex, userNotify, insAccountId, insDtTime, updAccountId, updDtTime,
            logicalDelDiv);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6323008+08:00", comments = "Source Table: t_user")
    @SelectProvider(type = SqlProviderAdapter.class, method = "select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6492906+08:00", comments = "Source Table: t_user")
    @DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6492906+08:00", comments = "Source Table: t_user")
    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<TUser> insertStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6502903+08:00", comments = "Source Table: t_user")
    @InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<TUser> multipleInsertStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6512893+08:00", comments = "Source Table: t_user")
    @SelectProvider(type = SqlProviderAdapter.class, method = "select")
    @ResultMap("TUserResult")
    Optional<TUser> selectOne(SelectStatementProvider selectStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6512893+08:00", comments = "Source Table: t_user")
    @SelectProvider(type = SqlProviderAdapter.class, method = "select")
    @Results(id = "TUserResult", value = {
            @Result(column = "id", property = "id", jdbcType = JdbcType.OTHER, id = true),
            @Result(column = "user_name", property = "userName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "user_fullname", property = "userFullname", jdbcType = JdbcType.VARCHAR),
            @Result(column = "password", property = "password", jdbcType = JdbcType.VARCHAR),
            @Result(column = "authority", property = "authority", jdbcType = JdbcType.INTEGER),
            @Result(column = "position", property = "position", jdbcType = JdbcType.INTEGER),
            @Result(column = "user_mail", property = "userMail", jdbcType = JdbcType.VARCHAR),
            @Result(column = "user_tel", property = "userTel", jdbcType = JdbcType.VARCHAR),
            @Result(column = "user_depart", property = "userDepart", jdbcType = JdbcType.VARCHAR),
            @Result(column = "user_sex", property = "userSex", jdbcType = JdbcType.INTEGER),
            @Result(column = "user_notify", property = "userNotify", jdbcType = JdbcType.INTEGER),
            @Result(column = "ins_account_id", property = "insAccountId", jdbcType = JdbcType.OTHER),
            @Result(column = "ins_dt_time", property = "insDtTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "upd_account_id", property = "updAccountId", jdbcType = JdbcType.OTHER),
            @Result(column = "upd_dt_time", property = "updDtTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "logical_del_div", property = "logicalDelDiv", jdbcType = JdbcType.INTEGER),})
    List<TUser> selectMany(SelectStatementProvider selectStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6532879+08:00", comments = "Source Table: t_user")
    @UpdateProvider(type = SqlProviderAdapter.class, method = "update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6532879+08:00", comments = "Source Table: t_user")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, TUser, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6532879+08:00", comments = "Source Table: t_user")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, TUser, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6542907+08:00", comments = "Source Table: t_user")
    default int deleteByPrimaryKey(Object id_) {
        return delete(c -> c.where(id, isEqualTo(id_)));
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6552898+08:00", comments = "Source Table: t_user")
    default int insert(TUser record) {
        return MyBatis3Utils.insert(this::insert, record, TUser, c -> c.map(id).toProperty("id").map(userName)
                .toProperty("userName").map(userFullname).toProperty("userFullname").map(password)
                .toProperty("password").map(authority).toProperty("authority").map(position).toProperty("position")
                .map(userMail).toProperty("userMail").map(userTel).toProperty("userTel").map(userDepart)
                .toProperty("userDepart").map(userSex).toProperty("userSex").map(userNotify).toProperty("userNotify")
                .map(insAccountId).toProperty("insAccountId").map(insDtTime).toProperty("insDtTime").map(updAccountId)
                .toProperty("updAccountId").map(updDtTime).toProperty("updDtTime").map(logicalDelDiv)
                .toProperty("logicalDelDiv"));
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6562867+08:00", comments = "Source Table: t_user")
    default int insertMultiple(Collection<TUser> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, TUser, c -> c.map(id).toProperty("id")
                .map(userName).toProperty("userName").map(userFullname).toProperty("userFullname").map(password)
                .toProperty("password").map(authority).toProperty("authority").map(position).toProperty("position")
                .map(userMail).toProperty("userMail").map(userTel).toProperty("userTel").map(userDepart)
                .toProperty("userDepart").map(userSex).toProperty("userSex").map(userNotify).toProperty("userNotify")
                .map(insAccountId).toProperty("insAccountId").map(insDtTime).toProperty("insDtTime").map(updAccountId)
                .toProperty("updAccountId").map(updDtTime).toProperty("updDtTime").map(logicalDelDiv)
                .toProperty("logicalDelDiv"));
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6562867+08:00", comments = "Source Table: t_user")
    default int insertSelective(TUser record) {
        return MyBatis3Utils.insert(this::insert, record, TUser,
                c -> c.map(id).toPropertyWhenPresent("id", record::getId).map(userName)
                        .toPropertyWhenPresent("userName", record::getUserName).map(userFullname)
                        .toPropertyWhenPresent("userFullname", record::getUserFullname).map(password)
                        .toPropertyWhenPresent("password", record::getPassword).map(authority)
                        .toPropertyWhenPresent("authority", record::getAuthority).map(position)
                        .toPropertyWhenPresent("position", record::getPosition).map(userMail)
                        .toPropertyWhenPresent("userMail", record::getUserMail).map(userTel)
                        .toPropertyWhenPresent("userTel", record::getUserTel).map(userDepart)
                        .toPropertyWhenPresent("userDepart", record::getUserDepart).map(userSex)
                        .toPropertyWhenPresent("userSex", record::getUserSex).map(userNotify)
                        .toPropertyWhenPresent("userNotify", record::getUserNotify).map(insAccountId)
                        .toPropertyWhenPresent("insAccountId", record::getInsAccountId).map(insDtTime)
                        .toPropertyWhenPresent("insDtTime", record::getInsDtTime).map(updAccountId)
                        .toPropertyWhenPresent("updAccountId", record::getUpdAccountId).map(updDtTime)
                        .toPropertyWhenPresent("updDtTime", record::getUpdDtTime).map(logicalDelDiv)
                        .toPropertyWhenPresent("logicalDelDiv", record::getLogicalDelDiv));
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.658286+08:00", comments = "Source Table: t_user")
    default Optional<TUser> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, TUser, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6592854+08:00", comments = "Source Table: t_user")
    default List<TUser> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, TUser, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6592854+08:00", comments = "Source Table: t_user")
    default List<TUser> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, TUser, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6602838+08:00", comments = "Source Table: t_user")
    default Optional<TUser> selectByPrimaryKey(Object id_) {
        return selectOne(c -> c.where(id, isEqualTo(id_)));
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6602838+08:00", comments = "Source Table: t_user")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, TUser, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6612832+08:00", comments = "Source Table: t_user")
    static UpdateDSL<UpdateModel> updateAllColumns(TUser record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId).set(userName).equalTo(record::getUserName).set(userFullname)
                .equalTo(record::getUserFullname).set(password).equalTo(record::getPassword).set(authority)
                .equalTo(record::getAuthority).set(position).equalTo(record::getPosition).set(userMail)
                .equalTo(record::getUserMail).set(userTel).equalTo(record::getUserTel).set(userDepart)
                .equalTo(record::getUserDepart).set(userSex).equalTo(record::getUserSex).set(userNotify)
                .equalTo(record::getUserNotify).set(insAccountId).equalTo(record::getInsAccountId).set(insDtTime)
                .equalTo(record::getInsDtTime).set(updAccountId).equalTo(record::getUpdAccountId).set(updDtTime)
                .equalTo(record::getUpdDtTime).set(logicalDelDiv).equalTo(record::getLogicalDelDiv);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6612832+08:00", comments = "Source Table: t_user")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(TUser record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId).set(userName).equalToWhenPresent(record::getUserName)
                .set(userFullname).equalToWhenPresent(record::getUserFullname).set(password)
                .equalToWhenPresent(record::getPassword).set(authority).equalToWhenPresent(record::getAuthority)
                .set(position).equalToWhenPresent(record::getPosition).set(userMail)
                .equalToWhenPresent(record::getUserMail).set(userTel).equalToWhenPresent(record::getUserTel)
                .set(userDepart).equalToWhenPresent(record::getUserDepart).set(userSex)
                .equalToWhenPresent(record::getUserSex).set(userNotify).equalToWhenPresent(record::getUserNotify)
                .set(insAccountId).equalToWhenPresent(record::getInsAccountId).set(insDtTime)
                .equalToWhenPresent(record::getInsDtTime).set(updAccountId).equalToWhenPresent(record::getUpdAccountId)
                .set(updDtTime).equalToWhenPresent(record::getUpdDtTime).set(logicalDelDiv)
                .equalToWhenPresent(record::getLogicalDelDiv);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6622828+08:00", comments = "Source Table: t_user")
    default int updateByPrimaryKey(TUser record) {
        return update(c -> c.set(userName).equalTo(record::getUserName).set(userFullname)
                .equalTo(record::getUserFullname).set(password).equalTo(record::getPassword).set(authority)
                .equalTo(record::getAuthority).set(position).equalTo(record::getPosition).set(userMail)
                .equalTo(record::getUserMail).set(userTel).equalTo(record::getUserTel).set(userDepart)
                .equalTo(record::getUserDepart).set(userSex).equalTo(record::getUserSex).set(userNotify)
                .equalTo(record::getUserNotify).set(insAccountId).equalTo(record::getInsAccountId).set(insDtTime)
                .equalTo(record::getInsDtTime).set(updAccountId).equalTo(record::getUpdAccountId).set(updDtTime)
                .equalTo(record::getUpdDtTime).set(logicalDelDiv).equalTo(record::getLogicalDelDiv).where(id, isEqualTo(record::getId)));
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6632833+08:00", comments = "Source Table: t_user")
    default int updateByPrimaryKeySelective(TUser record) {
        return update(c -> c.set(userName).equalToWhenPresent(record::getUserName).set(userFullname)
                .equalToWhenPresent(record::getUserFullname).set(password).equalToWhenPresent(record::getPassword)
                .set(authority).equalToWhenPresent(record::getAuthority).set(position)
                .equalToWhenPresent(record::getPosition).set(userMail).equalToWhenPresent(record::getUserMail)
                .set(userTel).equalToWhenPresent(record::getUserTel).set(userDepart)
                .equalToWhenPresent(record::getUserDepart).set(userSex).equalToWhenPresent(record::getUserSex)
                .set(userNotify).equalToWhenPresent(record::getUserNotify).set(insAccountId)
                .equalToWhenPresent(record::getInsAccountId).set(insDtTime).equalToWhenPresent(record::getInsDtTime)
                .set(updAccountId).equalToWhenPresent(record::getUpdAccountId).set(updDtTime)
                .equalToWhenPresent(record::getUpdDtTime).set(logicalDelDiv)
                .equalToWhenPresent(record::getLogicalDelDiv)
                .where(id, isEqualTo(record::getId)));
    }
}
