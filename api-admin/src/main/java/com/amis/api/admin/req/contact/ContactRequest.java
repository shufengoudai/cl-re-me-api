package com.amis.api.admin.req.contact;

import lombok.Data;

@Data
public class ContactRequest {
    private String contactName;
    private Integer contactAge;
    private Integer contactSex;
    private String contactNation;
    private String contactBirthplace;
    private String contactNationCurrent;
    private String contactPlaceCurrent;
    private String companyName;

}
