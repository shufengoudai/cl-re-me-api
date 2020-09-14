package com.amis.api.admin.entity.company;

import lombok.Data;

import java.util.UUID;

@Data
public class CompanyItem {
    private UUID id;
    private String companyName;
}
