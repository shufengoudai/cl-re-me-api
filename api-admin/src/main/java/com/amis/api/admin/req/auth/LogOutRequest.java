package com.amis.api.admin.req.auth;

import lombok.Data;

/** 登录验证 */
@Data
public class LogOutRequest {

  private String uid;

  private String token;

}
