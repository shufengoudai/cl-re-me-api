package com.amis.api.admin.controller.user;

import com.amis.api.admin.constant.MessageConstant;
import com.amis.api.admin.controller.BaseController;
import com.amis.api.admin.entity.user.User;
import com.amis.api.admin.entity.user.UserWindow;
import com.amis.api.admin.req.user.PasswordChangeRequest;
import com.amis.api.admin.req.user.UserRequest;
import com.amis.api.admin.res.user.UserWindowResponse;
import com.amis.api.admin.service.auth.AuthRoleAdminService;
import com.amis.api.admin.service.user.UserService;
import com.amis.api.admin.util.LangUtil;
import com.amis.api.admin.util.MessageUtil;
import com.amis.api.common.enums.ResultEnum;
import com.amis.api.common.res.BaseResponse;
import com.amis.api.common.util.ResultVOUtils;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

@RestController
public class UserController extends BaseController {

    @Resource
    private UserService userService;

    /**
     * user表，检索一览数据
     * @param companyId
     * @return
     */
    @GetMapping("/user/index")
    public BaseResponse listUser(@RequestParam("companyId") String companyId) {
        List<User> res = userService.listUser(companyId);
        return ResultVOUtils.success(res);
    }

    /**
     * user表，插入数据
     * @param data
     * @return
     */
    @PostMapping("/user/insert")
    public BaseResponse setUser(@RequestBody @Valid UserRequest data) {
        boolean res = userService.setUser(data);
        if (!res) {
            return ResultVOUtils.error(ResultEnum.OPERATE_ERROR,
                    MessageUtil.getMessage(MessageConstant.messageWarning,MessageConstant.operateError,
                            LangUtil.getLangFromRedis(httpServletRequest.getHeader(MessageConstant.token))));
        }
        return ResultVOUtils.success(res);
    }

    /**
     * user表，检索单条user数据
     * @param id
     * @return
     */
    @GetMapping("/user/detail")
    public BaseResponse userDetail(@RequestParam("id") String id) {
        User res = userService.userDetail(id);
        return ResultVOUtils.success(res);
    }

    /**
     * user表，更新user喜喜
     * @param data
     * @return
     */
    @PostMapping("/user/update")
    public BaseResponse updateUser(@RequestBody @Valid UserRequest data) {
        boolean res = userService.updateUser(data);
        if (!res) {
            return ResultVOUtils.error(ResultEnum.OPERATE_ERROR,
                    MessageUtil.getMessage(MessageConstant.messageWarning,MessageConstant.operateError,
                            LangUtil.getLangFromRedis(httpServletRequest.getHeader(MessageConstant.token))));
        }
        return ResultVOUtils.success(res);
    }

    /**
     * user表，修改密码
     * @param data
     * @return
     */
    @PostMapping("/user/changePW")
    public BaseResponse changePassword(@RequestBody @Valid PasswordChangeRequest data) {
        boolean res = userService.changePassword(data);
        //跑不到
        if (!res) {
            return ResultVOUtils.error(ResultEnum.OPERATE_ERROR,
                    MessageUtil.getMessage(MessageConstant.messageWarning,MessageConstant.operateError,
                            LangUtil.getLangFromRedis(httpServletRequest.getHeader(MessageConstant.token))));
        }
        return ResultVOUtils.success(res);
    }

    @GetMapping("/user/getUser")
    public BaseResponse getUser(@RequestParam("id") String id) {
        User user = userService.getUser(id);
        return ResultVOUtils.success(user);
    }

    @PostMapping("/user/list/name")
    public BaseResponse getUserWindow(){
        List<UserWindow> userWindowList = userService.getUserList();
        UserWindowResponse userWindowResponse = new UserWindowResponse();
        userWindowResponse.setUserList(userWindowList);
        return ResultVOUtils.success(userWindowResponse);
    }
}
