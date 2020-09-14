package com.amis.api.admin.controller.controller;

import com.amis.api.admin.entity.company.CompanyItem;
import com.amis.api.admin.res.company.CompanyItemResponse;
import com.amis.api.admin.service.company.CompanyService;
import com.amis.api.common.res.BaseResponse;
import com.amis.api.common.util.ResultVOUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class CompanyController {
    @Resource private CompanyService companyService;

    /**
     * 查询可选择的单位
     * @return
     */
    @PostMapping("/company/list/name")
    public BaseResponse getCompanyList(){
        List<CompanyItem> companyList = companyService.getCompanyList();
        CompanyItemResponse companyItemResponse = new CompanyItemResponse();
        companyItemResponse.setCompanyList(companyList);
        return ResultVOUtils.success(companyItemResponse);
    }
}
