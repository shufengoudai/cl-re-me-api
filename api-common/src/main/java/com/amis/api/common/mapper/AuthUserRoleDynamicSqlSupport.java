package com.amis.api.common.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class AuthUserRoleDynamicSqlSupport {

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:45.0076712+08:00",
      comments = "Source Table: auth_user_role")
  public static final AuthUserRole authUserRole = new AuthUserRole();

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:45.0086706+08:00",
      comments = "Source field: auth_user_role.role_id")
  public static final SqlColumn<Integer> roleId = authUserRole.roleId;

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:45.0086706+08:00",
      comments = "Source field: auth_user_role.user_id")
  public static final SqlColumn<Object> userId = authUserRole.userId;

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:45.0086706+08:00",
      comments = "Source Table: auth_user_role")
  public static final class AuthUserRole extends SqlTable {
    public final SqlColumn<Integer> roleId = column("role_id", JDBCType.INTEGER);
    public final SqlColumn<Object> userId = column("user_id", JDBCType.OTHER);

    public AuthUserRole() {
      super("auth_user_role");
    }
  }
}
