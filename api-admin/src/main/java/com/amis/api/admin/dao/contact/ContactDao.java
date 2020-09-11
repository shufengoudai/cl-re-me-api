package com.amis.api.admin.dao.contact;

import com.amis.api.admin.dto.contact.ContactDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.UUID;

@Mapper
public interface ContactDao {
    List<ContactDto> listContactInfo();

    Boolean deleteContactLogical(UUID id);

    String getContacterCompanyCurrents(UUID id);
}
