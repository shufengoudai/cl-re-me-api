package com.amis.api.admin.service.auth;

import com.amis.api.admin.entity.auth.AuthAdmin;
import com.amis.api.admin.req.auth.AuthAdminQueryRequest;
import java.util.List;

public interface AuthAdminService {

  List<AuthAdmin> listAdminPage(AuthAdminQueryRequest authAdminQueryRequest);

  AuthAdmin findByUserName(String userName);

  AuthAdmin findById(Object id);

  AuthAdmin findPwdById(String id);

  boolean insertAuthAdmin(AuthAdmin authAdmin);

  boolean updateAuthAdmin(AuthAdmin authAdmin);

  boolean deleteById(Long id);
}
