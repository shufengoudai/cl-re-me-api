package com.amis.api.admin.service.contact.impl;

import com.amis.api.admin.dao.contact.ContactDao;
import com.amis.api.admin.req.contact.ContactRequest;
import com.amis.api.admin.service.BaseServiceImpl;
import com.amis.api.admin.service.contact.ContactInfoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ContactInfoServiceImpl extends BaseServiceImpl implements ContactInfoService {
    @Autowired
    private ContactDao contactDao;

    @Override
    public List<ContactRequest> listContactInfo() {
        return contactDao.listContactInfo();
    }
}
