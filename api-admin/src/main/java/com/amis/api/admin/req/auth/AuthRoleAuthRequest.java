package com.amis.api.admin.req.auth;

import java.util.List;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.Data;

/** 角色的授权提交表单 */
@Data
public class AuthRoleAuthRequest {
  @NotNull(message = "请选择角色")
  private Long roleId;

  @NotEmpty(message = "请选择授权的权限规则")
  private List<Long> authRules;
}
