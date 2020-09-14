package com.amis.api.admin.res.company;

import com.amis.api.admin.entity.company.CompanyItem;
import lombok.Data;

import java.util.List;

@Data
public class CompanyItemResponse {
    private List<CompanyItem> companyList;
}
