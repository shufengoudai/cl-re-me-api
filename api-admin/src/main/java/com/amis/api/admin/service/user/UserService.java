package com.amis.api.admin.service.user;

import com.amis.api.admin.entity.user.User;
import com.amis.api.admin.req.user.PasswordChangeRequest;
import com.amis.api.admin.req.user.UserRequest;
import com.amis.api.common.dto.PulldownDto;
import java.util.List;

public interface UserService {

  List<PulldownDto> userProjectList(String userId);

  List<User> listUser(String companyId);

  boolean setUser(UserRequest data);

  User userDetail(String userId);

  boolean updateUser(UserRequest data);

  boolean changePassword(PasswordChangeRequest data);

  User getUser(String id);

}
