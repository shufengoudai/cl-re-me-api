package com.amis.api.admin.controller.contact;

import com.amis.api.admin.req.contact.ContactRequest;
import com.amis.api.admin.service.contact.ContactInfoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class ContactInfoController {
    @Resource private ContactInfoService contactInfoService;

    //查询联络人一览信息
    @PostMapping("/contact/info")
    public List<ContactRequest> listContactInfo(){
        List<ContactRequest> contactRequests = contactInfoService.listContactInfo();
        return contactRequests;
    }
}
