package com.amis.api.admin.service.contact;

import com.amis.api.admin.req.contact.ContactRequest;

import java.util.List;

public interface ContactInfoService {
    List<ContactRequest> listContactInfo();
}
