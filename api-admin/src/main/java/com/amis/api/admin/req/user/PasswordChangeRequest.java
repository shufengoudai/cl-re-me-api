package com.amis.api.admin.req.user;

import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
public class PasswordChangeRequest {

    private UUID id;

    private String password;

    private UUID insAccountId;

    private Date updDtTime;
}
