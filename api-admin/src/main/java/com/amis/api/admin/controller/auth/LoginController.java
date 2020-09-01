package com.amis.api.admin.controller.auth;

import com.amis.api.admin.annotation.AuthRuleAnnotation;
import com.amis.api.admin.controller.BaseController;
import com.amis.api.admin.entity.auth.AuthAdmin;
import com.amis.api.admin.exception.JsonException;
import com.amis.api.admin.req.auth.LogOutRequest;
import com.amis.api.admin.req.auth.LoginRequest;
import com.amis.api.admin.req.auth.UpdatePasswordRequest;
import com.amis.api.admin.res.auth.LoginUserInfoResponse;
import com.amis.api.admin.service.auth.AuthAdminService;
import com.amis.api.admin.service.auth.AuthLoginService;
import com.amis.api.admin.util.CacheUtils;
import com.amis.api.admin.util.JwtUtils;
import com.amis.api.admin.util.PasswordUtils;
import com.amis.api.common.enums.ResultEnum;
import com.amis.api.common.res.BaseResponse;
import com.amis.api.common.util.ResultVOUtils;
import io.jsonwebtoken.Claims;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/** 登录相关 */
@RestController
public class LoginController extends BaseController {

  @Autowired private AuthLoginService authLoginService;

  @Autowired private AuthAdminService authAdminService;

  /**
   * 用户登录
   *
   * @return
   */
  @SuppressWarnings("rawtypes")
  @PostMapping(value = "/admin/auth/login/authtype")
  public BaseResponse getAuthType(
          @RequestBody @Valid LoginRequest loginRequest,
          BindingResult bindingResult,
          HttpServletRequest request) {
    AuthAdmin authAdmin = authAdminService.findByUserName(loginRequest.getUserName());
    if (authAdmin == null || StringUtils.isEmpty(authAdmin.getUsername())) {
      throw new JsonException(ResultEnum.DATA_NOT, "用户名或密码错误");
    }

    return ResultVOUtils.success(authAdmin.getAuthType());
  }

  /**
   * 用户登录
   *
   * @return
   */
  @SuppressWarnings("rawtypes")
  @PostMapping(value = "/admin/auth/login/index")
  public BaseResponse index(
      @RequestBody @Valid LoginRequest loginRequest,
      BindingResult bindingResult,
      HttpServletRequest request) {
    if (bindingResult.hasErrors()) {
      return ResultVOUtils.error(
          ResultEnum.PARAM_VERIFY_FALL, bindingResult.getFieldError().getDefaultMessage());
    }

    AuthAdmin authAdmin = authAdminService.findByUserName(loginRequest.getUserName());
    if (authAdmin == null || StringUtils.isEmpty(authAdmin.getUsername())) {
      throw new JsonException(ResultEnum.DATA_NOT, "用户名或密码错误");
    }

    if (!PasswordUtils.checkPassword(loginRequest.getPwd(), authAdmin.getPassword())) {
      throw new JsonException(ResultEnum.DATA_NOT, "用户名或密码错误");
    }

    // 更新登录状态
    //        AuthAdmin authAdminUp = new AuthAdmin();
    //        authAdminUp.setId(authAdmin.getId());
    //        authAdminUp.setLastLoginTime(new Date());
    //        authAdminUp.setLastLoginIp(IpUtils.getIpAddr(request));
    //        authAdminService.updateAuthAdmin(authAdminUp);

    // 登录成功后获取权限，这里面会设置到缓存
    //authLoginService.listRuleByAdminId(authAdmin.getId());

    Map<String, Object> claims = new HashMap<>();
    claims.put("admin_id", authAdmin.getId());
    String token = JwtUtils.createToken(claims, 86400L); // 一天后过期

    Map<String, Object> map = new HashMap<>();
    map.put("id", authAdmin.getId());
    map.put("token", token);

    //用户前台语种保存到redis里面
    CacheUtils.set(token,String.valueOf(loginRequest.getLang()),86400L);

    return ResultVOUtils.success(map);
  }


  /**
   * 用户登录
   *
   * @return
   */
  @SuppressWarnings("rawtypes")
  @PostMapping(value = "/admin/auth/login/nopwd")
  public BaseResponse indexByNoPwd(
          @RequestBody @Valid LoginRequest loginRequest,
          BindingResult bindingResult,
          HttpServletRequest request) {
    AuthAdmin authAdmin = authAdminService.findByUserName(loginRequest.getUserName());
    if (authAdmin == null || StringUtils.isEmpty(authAdmin.getUsername())) {
      throw new JsonException(ResultEnum.DATA_NOT, "用户名或密码错误");
    }

    Map<String, Object> claims = new HashMap<>();
    claims.put("admin_id", authAdmin.getId());
    String token = JwtUtils.createToken(claims, 86400L); // 一天后过期

    Map<String, Object> map = new HashMap<>();
    map.put("id", authAdmin.getId());
    map.put("token", token);

    //用户前台语种保存到redis里面
    CacheUtils.set(token,String.valueOf(loginRequest.getLang()),86400L);

    return ResultVOUtils.success(map);
  }

  /**
   * reflesh token用户登录
   *
   * @return
   */
  @SuppressWarnings("rawtypes")
  @PostMapping(value = "/admin/auth/login/reflesh")
  public BaseResponse reflesh(HttpServletRequest request) {

    String id = request.getHeader("X-Adminid");
    Integer adminId = null;
    try {
      adminId = Integer.valueOf(id);
    } catch (Exception e) {
      throw new JsonException(ResultEnum.LOGIN_VERIFY_FALL);
    }

    AuthAdmin authAdmin = authAdminService.findById(adminId);

    String tokenCheck = request.getHeader("X-Reflesh-Token");
    if (tokenCheck == null) {
      throw new JsonException(ResultEnum.LOGIN_VERIFY_FALL);
    }

    // 验证 token
    Claims claimsCheck = JwtUtils.parse(tokenCheck);
    if (claimsCheck == null) {
      throw new JsonException(ResultEnum.LOGIN_VERIFY_FALL);
    }
    Integer jwtAdminId = Integer.valueOf(claimsCheck.get("admin_id").toString());
    if (adminId.compareTo(jwtAdminId) != 0) {
      throw new JsonException(ResultEnum.LOGIN_VERIFY_FALL);
    }

    Map<String, Object> claims = new HashMap<>();
    claims.put("admin_id", authAdmin.getId());
    String token = JwtUtils.createToken(claims, 86400L); // 一天后过期
    String refleshToken = JwtUtils.createToken(claims, 2 * 86400L); // 二天后过期

    Map<String, Object> map = new HashMap<>();
    map.put("id", authAdmin.getId());
    map.put("token", token);
    map.put("reflesh-token", refleshToken);

    return ResultVOUtils.success(map);
  }

  /**
   * 获取登录用户信息
   *
   * @return
   */
  @SuppressWarnings("rawtypes")
  @AuthRuleAnnotation("")
  @GetMapping("/admin/auth/login/userInfo")
  public BaseResponse userInfo(HttpServletRequest request) {
    String adminId = request.getHeader("X-Adminid");
    Object id = UUID.fromString(adminId);

    AuthAdmin authAdmin = authAdminService.findById(id);

    //List<String> authRules = authLoginService.listRuleByAdminId(authAdmin.getId());

    LoginUserInfoResponse loginUserInfoResponse = new LoginUserInfoResponse();
    BeanUtils.copyProperties(authAdmin, loginUserInfoResponse);
    //loginUserInfoResponse.setAuthRules(authRules);

    return ResultVOUtils.success(loginUserInfoResponse);
  }

  /**
   * 登出
   *
   * @return
   */
  @SuppressWarnings("rawtypes")
  @PostMapping("/admin/auth/login/out")
  public BaseResponse out(@RequestBody LogOutRequest logOutRequest) {
    //删除redis中的lang
    String token=logOutRequest.getToken();
    if(token!=null){
      CacheUtils.delete(token);
    }
    return ResultVOUtils.success();
  }

  /**
   * 修改密码
   *
   * @return
   */
  @SuppressWarnings("rawtypes")
  @AuthRuleAnnotation("") // 需要登录验证,但是不需要权限验证时,value 值填空字符串
  @PostMapping("/admin/auth/login/password")
  public BaseResponse password(
      @RequestBody @Valid UpdatePasswordRequest updatePasswordRequest,
      BindingResult bindingResult) {
    if (bindingResult.hasErrors()) {
      return ResultVOUtils.error(
          ResultEnum.PARAM_VERIFY_FALL.getCode(),
          bindingResult.getFieldError().getDefaultMessage());
    }

    AuthAdmin authAdmin = authAdminService.findPwdById(updatePasswordRequest.getAdminId());
//    if (authAdmin == null) {
//      throw new JsonException(ResultEnum.DATA_NOT);
//    }
    //        String oldPwd = PasswordUtils.authAdminPwd(updatePasswordRequest.getOldPassword());
    // 旧密码不对
    if (!PasswordUtils.checkPassword(
        updatePasswordRequest.getOld_password(), authAdmin.getPassword())) {
      //        if (authAdmin.getPassword() != null
      //                && !authAdmin.getPassword().equals(oldPwd)) {
      return ResultVOUtils.error(ResultEnum.DATA_NOT, "旧密码匹配失败");
    }

    AuthAdmin authAdminUp = new AuthAdmin();
    authAdminUp.setId(authAdmin.getId());
    String newPwd = PasswordUtils.hashPassword(updatePasswordRequest.getNew_password());
    authAdminUp.setPassword(newPwd);

    boolean b = authAdminService.updateAuthAdmin(authAdminUp);
    if (b) {
      return ResultVOUtils.success();
    }
    return ResultVOUtils.error(ResultEnum.DATA_CHANGE);
  }
}
