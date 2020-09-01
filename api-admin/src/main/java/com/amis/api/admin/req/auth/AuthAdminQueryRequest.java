package com.amis.api.admin.req.auth;

import com.amis.api.admin.req.ListPageRequest;
import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class AuthAdminQueryRequest extends ListPageRequest {

  private String username;

  private Integer status;

  private Long roleId;

  private List<Object> ids;
}
