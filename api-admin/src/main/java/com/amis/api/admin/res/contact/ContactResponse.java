package com.amis.api.admin.res.contact;

import com.amis.api.admin.dto.contact.ContactDto;
import lombok.Data;

import java.util.List;

@Data
public class ContactResponse {
    List<ContactDto> contacts;
}
