package com.amis.api.admin.dao.contact;

import com.amis.api.admin.req.contact.ContactRequest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ContactDao {
    List<ContactRequest> listContactInfo();
}
