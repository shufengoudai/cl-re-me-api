package com.amis.api.admin.res.auth;

import lombok.Data;

import java.util.Date;

/** 角色视图 */
@Data
public class AuthRoleResponse {

  private Long id;
  private String name;
  private Long pid;
  private Long status;
  private String remark;
  private Long listorder;
  private Date createTime;
  private Date updateTime;
}
