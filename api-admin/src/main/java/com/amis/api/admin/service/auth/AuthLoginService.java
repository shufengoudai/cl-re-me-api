package com.amis.api.admin.service.auth;

import java.util.List;

public interface AuthLoginService {

  List<String> listRuleByAdminId(Object adminId);
}
