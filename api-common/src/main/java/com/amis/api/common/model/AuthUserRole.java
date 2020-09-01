package com.amis.api.common.model;

import javax.annotation.Generated;

public class AuthUserRole {

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:45.0076712+08:00",
      comments = "Source field: auth_user_role.role_id")
  private Integer roleId;

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:45.0076712+08:00",
      comments = "Source field: auth_user_role.user_id")
  private Object userId;

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:45.0076712+08:00",
      comments = "Source field: auth_user_role.role_id")
  public Integer getRoleId() {
    return roleId;
  }

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:45.0076712+08:00",
      comments = "Source field: auth_user_role.role_id")
  public void setRoleId(Integer roleId) {
    this.roleId = roleId;
  }

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:45.0076712+08:00",
      comments = "Source field: auth_user_role.user_id")
  public Object getUserId() {
    return userId;
  }

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:45.0076712+08:00",
      comments = "Source field: auth_user_role.user_id")
  public void setUserId(Object userId) {
    this.userId = userId;
  }
}
