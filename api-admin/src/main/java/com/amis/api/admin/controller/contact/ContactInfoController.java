package com.amis.api.admin.controller.contact;

import com.amis.api.admin.constant.MessageConstant;
import com.amis.api.admin.controller.BaseController;
import com.amis.api.admin.dto.contact.ContactDto;
import com.amis.api.admin.res.contact.ContactResponse;
import com.amis.api.admin.service.contact.ContactInfoService;
import com.amis.api.admin.util.LangUtil;
import com.amis.api.admin.util.MessageUtil;
import com.amis.api.common.enums.ResultEnum;
import com.amis.api.common.res.BaseResponse;
import com.amis.api.common.util.ResultVOUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class ContactInfoController extends BaseController {
    @Resource private ContactInfoService contactInfoService;

    //查询联络人一览信息
    @PostMapping("/contact/info")
    public BaseResponse listContactInfo(){
        List<ContactDto> contactRequests = contactInfoService.listContactInfo();
//        List<ContactRequest> contactRequests = null;
        ContactResponse contactResponse = new ContactResponse();
        contactResponse.setContacts(contactRequests);
        if (contactRequests == null){
            return ResultVOUtils.error(ResultEnum.DATA_NOT,
                    MessageUtil.getMessage(MessageConstant.messageWarning,MessageConstant.dataNot,
                            LangUtil.getLangFromRedis(httpServletRequest.getHeader(MessageConstant.token))));
        }
        return ResultVOUtils.success(contactResponse);
    }

    //删除某个联络人
    @GetMapping("/contact/delete")
    public BaseResponse deleteContactLogical(@RequestParam("id") String id){
        Boolean res = contactInfoService.deleteContactLogical(id);
        if (!res){
            return ResultVOUtils.error(ResultEnum.OPERATE_ERROR);
        }
        return ResultVOUtils.success(res);
    }

    //拿到选中的联络人的当前单位的第一个(无论当前单位有几个)
    @GetMapping("/contact/edit/companyCurrent")
    public BaseResponse getContacterCompanyCurrent(@RequestParam("id") String id){
        String contactCompanyCurrent = contactInfoService.getContacterCompanyCurrent(id);
        return ResultVOUtils.success(contactCompanyCurrent);
    }
}
