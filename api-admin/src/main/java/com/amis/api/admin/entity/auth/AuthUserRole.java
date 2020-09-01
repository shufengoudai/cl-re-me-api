package com.amis.api.admin.entity.auth;

import lombok.Data;

/** 用户角色对应表 */
@Data
public class AuthUserRole {
  private Long id;
  private Long roleId;
  private Object adminId;
}
