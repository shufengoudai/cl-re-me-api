package com.amis.api.admin.dao.company;

import com.amis.api.admin.entity.company.CompanyItem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CompanyDao {
    List<CompanyItem> getCompanyList();
}
