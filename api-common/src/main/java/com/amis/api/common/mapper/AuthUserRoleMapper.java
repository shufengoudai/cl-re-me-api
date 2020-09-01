package com.amis.api.common.mapper;

import static com.amis.api.common.mapper.AuthUserRoleDynamicSqlSupport.*;

import com.amis.api.common.model.AuthUserRole;
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
public interface AuthUserRoleMapper {

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:45.0086706+08:00",
      comments = "Source Table: auth_user_role")
  BasicColumn[] selectList = BasicColumn.columnList(roleId, userId);

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:45.0086706+08:00",
      comments = "Source Table: auth_user_role")
  @SelectProvider(type = SqlProviderAdapter.class, method = "select")
  long count(SelectStatementProvider selectStatement);

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:45.0086706+08:00",
      comments = "Source Table: auth_user_role")
  @DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
  int delete(DeleteStatementProvider deleteStatement);

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:45.0086706+08:00",
      comments = "Source Table: auth_user_role")
  @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
  int insert(InsertStatementProvider<AuthUserRole> insertStatement);

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:45.0086706+08:00",
      comments = "Source Table: auth_user_role")
  @InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
  int insertMultiple(MultiRowInsertStatementProvider<AuthUserRole> multipleInsertStatement);

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:45.0086706+08:00",
      comments = "Source Table: auth_user_role")
  @SelectProvider(type = SqlProviderAdapter.class, method = "select")
  @ResultMap("AuthUserRoleResult")
  Optional<AuthUserRole> selectOne(SelectStatementProvider selectStatement);

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:45.0086706+08:00",
      comments = "Source Table: auth_user_role")
  @SelectProvider(type = SqlProviderAdapter.class, method = "select")
  @Results(
      id = "AuthUserRoleResult",
      value = {
        @Result(column = "role_id", property = "roleId", jdbcType = JdbcType.INTEGER),
        @Result(column = "user_id", property = "userId", jdbcType = JdbcType.OTHER)
      })
  List<AuthUserRole> selectMany(SelectStatementProvider selectStatement);

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:45.0086706+08:00",
      comments = "Source Table: auth_user_role")
  @UpdateProvider(type = SqlProviderAdapter.class, method = "update")
  int update(UpdateStatementProvider updateStatement);

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:45.0086706+08:00",
      comments = "Source Table: auth_user_role")
  default long count(CountDSLCompleter completer) {
    return MyBatis3Utils.countFrom(this::count, authUserRole, completer);
  }

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:45.0086706+08:00",
      comments = "Source Table: auth_user_role")
  default int delete(DeleteDSLCompleter completer) {
    return MyBatis3Utils.deleteFrom(this::delete, authUserRole, completer);
  }

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:45.0086706+08:00",
      comments = "Source Table: auth_user_role")
  default int insert(AuthUserRole record) {
    return MyBatis3Utils.insert(
        this::insert,
        record,
        authUserRole,
        c -> c.map(roleId).toProperty("roleId").map(userId).toProperty("userId"));
  }

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:45.0086706+08:00",
      comments = "Source Table: auth_user_role")
  default int insertMultiple(Collection<AuthUserRole> records) {
    return MyBatis3Utils.insertMultiple(
        this::insertMultiple,
        records,
        authUserRole,
        c -> c.map(roleId).toProperty("roleId").map(userId).toProperty("userId"));
  }

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:45.0086706+08:00",
      comments = "Source Table: auth_user_role")
  default int insertSelective(AuthUserRole record) {
    return MyBatis3Utils.insert(
        this::insert,
        record,
        authUserRole,
        c ->
            c.map(roleId)
                .toPropertyWhenPresent("roleId", record::getRoleId)
                .map(userId)
                .toPropertyWhenPresent("userId", record::getUserId));
  }

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:45.0086706+08:00",
      comments = "Source Table: auth_user_role")
  default Optional<AuthUserRole> selectOne(SelectDSLCompleter completer) {
    return MyBatis3Utils.selectOne(this::selectOne, selectList, authUserRole, completer);
  }

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:45.0096699+08:00",
      comments = "Source Table: auth_user_role")
  default List<AuthUserRole> select(SelectDSLCompleter completer) {
    return MyBatis3Utils.selectList(this::selectMany, selectList, authUserRole, completer);
  }

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:45.0096699+08:00",
      comments = "Source Table: auth_user_role")
  default List<AuthUserRole> selectDistinct(SelectDSLCompleter completer) {
    return MyBatis3Utils.selectDistinct(this::selectMany, selectList, authUserRole, completer);
  }

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:45.0096699+08:00",
      comments = "Source Table: auth_user_role")
  default int update(UpdateDSLCompleter completer) {
    return MyBatis3Utils.update(this::update, authUserRole, completer);
  }

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:45.0096699+08:00",
      comments = "Source Table: auth_user_role")
  static UpdateDSL<UpdateModel> updateAllColumns(AuthUserRole record, UpdateDSL<UpdateModel> dsl) {
    return dsl.set(roleId).equalTo(record::getRoleId).set(userId).equalTo(record::getUserId);
  }

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:45.0096699+08:00",
      comments = "Source Table: auth_user_role")
  static UpdateDSL<UpdateModel> updateSelectiveColumns(
      AuthUserRole record, UpdateDSL<UpdateModel> dsl) {
    return dsl.set(roleId)
        .equalToWhenPresent(record::getRoleId)
        .set(userId)
        .equalToWhenPresent(record::getUserId);
  }
}
