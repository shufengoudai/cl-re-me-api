package com.amis.api.admin.entity.auth;

import java.util.Date;
import lombok.Data;

/** 角色表 */
@Data
public class AuthRole {

  private Long id;
  private String name;
  private Long pid;
  private Long status;
  private String remark;
  private Long listorder;
  private Date createTime;
  private Date updateTime;
}
