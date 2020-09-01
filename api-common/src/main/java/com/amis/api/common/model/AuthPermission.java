package com.amis.api.common.model;

import javax.annotation.Generated;

public class AuthPermission {

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3073048+08:00", comments = "Source field: auth_permission.role_id")
    private Integer roleId;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3073048+08:00", comments = "Source field: auth_permission.permission_rule_id")
    private Integer permissionRuleId;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3073048+08:00", comments = "Source field: auth_permission.type")
    private String type;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3073048+08:00", comments = "Source field: auth_permission.role_id")
    public Integer getRoleId() {
        return roleId;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3073048+08:00", comments = "Source field: auth_permission.role_id")
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3073048+08:00", comments = "Source field: auth_permission.permission_rule_id")
    public Integer getPermissionRuleId() {
        return permissionRuleId;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3073048+08:00", comments = "Source field: auth_permission.permission_rule_id")
    public void setPermissionRuleId(Integer permissionRuleId) {
        this.permissionRuleId = permissionRuleId;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3073048+08:00", comments = "Source field: auth_permission.type")
    public String getType() {
        return type;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3073048+08:00", comments = "Source field: auth_permission.type")
    public void setType(String type) {
        this.type = type;
    }
}
