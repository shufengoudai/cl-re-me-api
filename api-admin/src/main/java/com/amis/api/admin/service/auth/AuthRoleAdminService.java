package com.amis.api.admin.service.auth;

import com.amis.api.admin.entity.auth.AuthUserRole;
import java.util.List;

public interface AuthRoleAdminService {

  AuthUserRole listByAdminId(Object adminId);

  List<AuthUserRole> listByAdminIdIn(List<Object> adminIds);

  List<AuthUserRole> listByRoleId(Long roleId);

  int insertAuthRoleAdminAll(List<AuthUserRole> authRoleAdminList);

  int insertRolesAdminIdAll(List<Long> roles, Object adminId);

  boolean deleteByAdminId(Object adminId);
}
