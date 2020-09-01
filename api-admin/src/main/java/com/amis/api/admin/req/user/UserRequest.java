package com.amis.api.admin.req.user;

import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
public class UserRequest {

    private UUID id;

    private String userName;

    private String userFullname;

    private String password;

    private Integer authority;

    private String position;

    private String userMail;

    private String userTel;

    private String userDepart;

    private Integer userSex;

    private Integer userNotify;

    private UUID insAccountId;

    private Date updDtTime;

    private UUID companyId;
}
