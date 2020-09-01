package com.amis.api.admin.req.auth;

import javax.validation.constraints.NotEmpty;
import lombok.Data;

/** reflesh token登录验证 */
@Data
public class RefleshRequest {

  @NotEmpty(message = "用户名不能为空")
  private String userName;

  @NotEmpty(message = "密码不能为空")
  private String pwd;
}
