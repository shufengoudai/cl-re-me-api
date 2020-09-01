package com.amis.api.admin.req.auth;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.Data;

/** 修改密码的表单 */
@Data
public class UpdatePasswordRequest {

  @NotNull(message = "参数错误！")
  private String adminId;

  @NotEmpty(message = "请输入旧密码")
  private String old_password;

  @NotEmpty(message = "请输入新密码")
  private String new_password;
}
