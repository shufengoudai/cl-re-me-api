package com.amis.api.admin.res.user;

import com.amis.api.admin.entity.user.UserWindow;
import lombok.Data;

import java.util.List;

@Data
public class UserWindowResponse {
    private List<UserWindow> userList;
}
