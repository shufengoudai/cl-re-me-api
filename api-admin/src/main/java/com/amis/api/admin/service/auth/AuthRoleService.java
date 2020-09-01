package com.amis.api.admin.service.auth;

import com.amis.api.admin.entity.auth.AuthRole;
import com.amis.api.admin.entity.auth.Authority;
import com.amis.api.admin.req.auth.AuthRoleQueryRequest;
import com.amis.api.admin.res.auth.AuthRoleResponse;

import java.util.List;

public interface AuthRoleService {

  List<AuthRole> listAdminPage(AuthRoleQueryRequest authRoleQueryRequest);

  List<AuthRole> listAuthAdminRolePage(Integer page, Integer limit, Integer status);

  AuthRole findByName(String name);

  boolean insertAuthRole(AuthRole authRole);

  boolean updateAuthRole(AuthRole authRole);

  boolean deleteById(Long id);

  List<Authority> searchAuthority(Integer authority);

  List<AuthRoleResponse> searchRole();

}
