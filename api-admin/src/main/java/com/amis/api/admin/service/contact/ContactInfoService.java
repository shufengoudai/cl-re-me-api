package com.amis.api.admin.service.contact;

import com.amis.api.admin.dto.contact.ContactDto;
import com.amis.api.admin.dto.contact.ContacterDto;

import java.util.List;

public interface ContactInfoService {
    List<ContactDto> listContactInfo();

    Boolean deleteContactLogical(String id);

    String getContacterCompanyCurrent(String id);

    ContacterDto getContacterInfo(String id);
}
