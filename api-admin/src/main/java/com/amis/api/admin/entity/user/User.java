package com.amis.api.admin.entity.user;
import lombok.Data;

import java.util.Date;

@Data
public class User {

    private Object id;

    private String userName;

    private String userFullname;

    private String position;

    private String userMail;

    private String userTel;

    private String userDepart;

    private Integer userSex;

    private Integer userNotify;

    private Object insAccountId;

    private Date insDtTime;

    private Object updAccountId;

    private Date updDtTime;

    private Integer authority;

    private String authorityName;

    private Object companyId;
}
