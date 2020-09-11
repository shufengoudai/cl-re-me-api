package com.amis.api.admin.req.contact;

import lombok.Data;

import java.util.List;

@Data
public class ContacterRequest {
    private String contactName;
    private Integer contactSex;
    private Integer contactAge;
    private Integer contactAgeGroup;
    private String contactBirthday;
    private String contactBirthpalce;
    private String contactNation;
    private String contactNationCurrent;
    private String contactPlaceCurrent;
    private String contactTel;
    private String contactMail;
    private String contactSocialMedia;
    private String contactSchool;
    private Integer contactLanguage1;
    private Integer contactLanguage2;
    private Integer contactLanguage3;
    private Integer contactLanguage4;
    private String contactPersonal;
    private String contactFavorite;
    private String contactChannel;
    private String relatePerson;
    private String contactMemo;
    private String contactPhotoId;
    private String contactPhoto;
    //编辑联络人信息
    private String companyName;
}
