package com.amis.api.admin.dto.contact;

import lombok.Data;

@Data
public class ContactDto {
    private String id;
    private String contactName;
    private Integer contactAge;
    private Integer contactSex;
    private String contactSexStr;
    private String contactNation;
    private String contactBirthpalce;
    private String contactNationCurrent;
    private String contactPlaceCurrent;
    private String companyName;

    public void setContactSexStr(Integer contactSex) {
        if (contactSex == 0){
            this.contactSexStr = "男";
        }else if (contactSex == 1){
            this.contactSexStr = "女";
        }
    }
}
