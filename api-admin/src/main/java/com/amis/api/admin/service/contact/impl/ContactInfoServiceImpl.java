package com.amis.api.admin.service.contact.impl;

import com.amis.api.admin.dao.contact.ContactDao;
import com.amis.api.admin.dto.contact.ContactDto;
import com.amis.api.admin.service.BaseServiceImpl;
import com.amis.api.admin.service.contact.ContactInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

@Service
public class ContactInfoServiceImpl extends BaseServiceImpl implements ContactInfoService {
    @Resource private ContactDao contactDao;

    @Override
    public List<ContactDto> listContactInfo() {
        List<ContactDto> contactRequests = contactDao.listContactInfo();
        for (int i = 0; i < contactRequests.size(); i++) {
            contactRequests.get(i).setContactSexStr(contactRequests.get(i).getContactSex());
        }
        return contactRequests;
    }

    @Override
    public Boolean deleteContactLogical(String id) {
        return contactDao.deleteContactLogical(UUID.fromString(id));
    }

    @Override
    public String getContacterCompanyCurrent(String id) {
        return contactDao.getContacterCompanyCurrents(UUID.fromString(id));
    }
}
