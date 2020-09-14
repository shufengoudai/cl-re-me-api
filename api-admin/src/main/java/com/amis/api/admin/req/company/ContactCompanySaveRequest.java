package com.amis.api.admin.req.company;

import lombok.Data;

import java.util.UUID;

@Data
public class ContactCompanySaveRequest {
    private UUID contactId;
    private Integer companyStatus;
    private String companyName;
    private Integer companyNation;
    private String companyAddress;
    private Integer companyType;
    private Integer companyIndusry;
    private String companyBusiness;
    private Integer companyEmployees;
    private Integer companyCapital;
    private Integer companyCaptialCurrency;
    private Integer companyStockFlag;
    private String companyStock;
    private Integer companyStockMarket;
    private String companyQualification;
    private String companyTel;
    private String companyMail;
    private String companyMemo;
    private String contactPosition;
    private String contactDepart;
    private String contactDepartTel;
}
