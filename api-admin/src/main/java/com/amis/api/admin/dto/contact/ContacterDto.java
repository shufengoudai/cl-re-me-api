package com.amis.api.admin.dto.contact;


import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ContacterDto {
    private String contactName;
    private Integer contactSex;
    private String contactSexStr;
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
    private List<String> contactLanguages = new ArrayList<>();
    private String contactPersonal;
    private String contactFavorite;
    private String contactChannel;
    private String relatePerson;
    private String contactMemo;
    private String contactPhotoId;
    private String contactPhoto;
    //编辑联络人信息
    private String companyName;
    private List<String> contactCompanyPast = new ArrayList<>();

    public void setContactSexStr(Integer contactSex) {
        if (contactSex == 0){
            this.contactSexStr = "男";
        }else if (contactSex == 1){
            this.contactSexStr = "女";
        }
    }

    private String convertContactLanguage(Integer contactLanguage){
        String str;
        if (contactLanguage == 0){
            str = "中文";
        }else if (contactLanguage == 1){
            str = "英语";
        }else if (contactLanguage == 2){
            str = "日语";
        }else if (contactLanguage == 3){
            str = "法语";
        }else if (contactLanguage == 4){
            str = "韩语";
        }else if (contactLanguage == 5){
            str = "德语";
        }else if (contactLanguage == 6){
            str = "中文（粤语）";
        }else {
            str = "";
        }
        return str;
    }

    private void NotNullContactLanguageStrAdd(Integer contactLanguage){
        if (contactLanguage != null){
            contactLanguages.add(convertContactLanguage(contactLanguage));
        }
    }

    //将数据库中的数据和前端一键对应
    public void flashType(){
        NotNullContactLanguageStrAdd(contactLanguage1);
        NotNullContactLanguageStrAdd(contactLanguage2);
        NotNullContactLanguageStrAdd(contactLanguage3);
        NotNullContactLanguageStrAdd(contactLanguage4);
        setContactSexStr(contactSex);
    }
}
