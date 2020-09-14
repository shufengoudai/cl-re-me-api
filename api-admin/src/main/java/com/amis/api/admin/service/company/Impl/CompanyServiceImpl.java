package com.amis.api.admin.service.company.Impl;

import com.amis.api.admin.dao.company.CompanyDao;
import com.amis.api.admin.entity.company.CompanyItem;
import com.amis.api.admin.service.company.CompanyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {
    @Resource private CompanyDao companyDao;

    @Override
    public List<CompanyItem> getCompanyList() {
        return companyDao.getCompanyList();
    }
}
