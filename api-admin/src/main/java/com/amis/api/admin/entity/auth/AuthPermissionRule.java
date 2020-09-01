package com.amis.api.admin.entity.auth;

import java.util.Date;
import lombok.Data;

/** 规则表 */
@Data
public class AuthPermissionRule {

  private Integer id;
  private Integer pid;
  private String name;
  private String title;
  private Integer status;
  private String condition;
  private Integer listorder;
  private Date createTime;
  private Date updateTime;
}
