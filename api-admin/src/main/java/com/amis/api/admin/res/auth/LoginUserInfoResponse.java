package com.amis.api.admin.res.auth;

import java.util.List;
import lombok.Data;

/** 登录用户的信息视图 */
@Data
public class LoginUserInfoResponse {

  private Long id;
  private String username;
  private String avatar;
  private Integer authType;
  // 权限列表
  private List<String> authRules;
}
