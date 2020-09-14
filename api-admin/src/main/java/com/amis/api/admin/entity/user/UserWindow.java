package com.amis.api.admin.entity.user;

import lombok.Data;

import java.util.UUID;

@Data
public class UserWindow {
    private UUID id;
    private String userName;
}
