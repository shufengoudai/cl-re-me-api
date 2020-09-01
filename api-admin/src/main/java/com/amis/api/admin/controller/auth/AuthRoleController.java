package com.amis.api.admin.controller.auth;

import com.amis.api.admin.annotation.AuthRuleAnnotation;
import com.amis.api.admin.controller.BaseController;
import com.amis.api.admin.entity.auth.AuthPermission;
import com.amis.api.admin.entity.auth.AuthPermissionRule;
import com.amis.api.admin.entity.auth.AuthRole;
import com.amis.api.admin.entity.auth.Authority;
import com.amis.api.admin.entity.user.User;
import com.amis.api.admin.req.auth.AuthRoleAuthRequest;
import com.amis.api.admin.req.auth.AuthRoleQueryRequest;
import com.amis.api.admin.req.auth.AuthRoleSaveRequest;
import com.amis.api.admin.res.PageSimpleResponse;
import com.amis.api.admin.res.auth.AuthPermissionRuleMergeResponse;
import com.amis.api.admin.res.auth.AuthRoleResponse;
import com.amis.api.admin.service.auth.AuthPermissionRuleService;
import com.amis.api.admin.service.auth.AuthPermissionService;
import com.amis.api.admin.service.auth.AuthRoleService;
import com.amis.api.admin.service.user.UserService;
import com.amis.api.admin.util.PermissionRuleTreeUtils;
import com.amis.api.common.enums.ResultEnum;
import com.amis.api.common.res.BaseResponse;
import com.amis.api.common.util.ResultVOUtils;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/** 角色相关 */
@RestController
public class AuthRoleController extends BaseController {

  @Resource private AuthRoleService authRoleService;

  @Resource private AuthPermissionRuleService authPermissionRuleService;

  @Resource private AuthPermissionService authPermissionService;

  @Resource private UserService userService;

  /** 角色列表 */
  @SuppressWarnings("rawtypes")
  @AuthRuleAnnotation("admin/auth/role/index")
  @GetMapping("/admin/auth/role/index")
  public BaseResponse index(
      @Valid AuthRoleQueryRequest authRoleQueryRequest, BindingResult bindingResult) {

    if (bindingResult.hasErrors()) {
      return ResultVOUtils.error(
          ResultEnum.PARAM_VERIFY_FALL, bindingResult.getFieldError().getDefaultMessage());
    }

    List<AuthRole> authRoleList = authRoleService.listAdminPage(authRoleQueryRequest);
    List<AuthRoleResponse> authRoleResponseList =
        authRoleList.stream()
            .map(
                item -> {
                  AuthRoleResponse authRoleResponse = new AuthRoleResponse();
                  BeanUtils.copyProperties(item, authRoleResponse);
                  return authRoleResponse;
                })
            .collect(Collectors.toList());

    PageInfo<AuthRole> pageInfo = new PageInfo<>(authRoleList);
    PageSimpleResponse<AuthRoleResponse> pageSimpleResponse = new PageSimpleResponse<>();
    pageSimpleResponse.setTotal(pageInfo.getTotal());
    pageSimpleResponse.setList(authRoleResponseList);
    return ResultVOUtils.success(pageSimpleResponse);
  }

  /**
   * 获取授权列表
   *
   * @param id
   * @return
   */
  @SuppressWarnings("rawtypes")
  @AuthRuleAnnotation("admin/auth/role/authList")
  @GetMapping("/admin/auth/role/authList")
  public BaseResponse authList(@RequestParam("id") Long id) {

    // 查询当前角色拥有的权限id
    List<AuthPermission> authPermissionList = authPermissionService.listByRoleId(id);
    List<Long> checkedKeys =
        authPermissionList.stream()
            .map(AuthPermission::getPermissionRuleId)
            .collect(Collectors.toList());

    // 查询所有权限规则
    List<AuthPermissionRule> authPermissionRuleList = authPermissionRuleService.listAll();
    List<AuthPermissionRuleMergeResponse> merge =
        PermissionRuleTreeUtils.merge(authPermissionRuleList, 0);

    Map<String, Object> restMap = new HashMap<>();
    restMap.put("list", merge);
    restMap.put("checkedKeys", checkedKeys);
    return ResultVOUtils.success(restMap);
  }

  @SuppressWarnings("rawtypes")
  @AuthRuleAnnotation("admin/auth/role/auth")
  @PostMapping("/admin/auth/role/auth")
  public BaseResponse auth(
      @RequestBody @Valid AuthRoleAuthRequest authRoleAuthRequest, BindingResult bindingResult) {

    if (bindingResult.hasErrors()) {
      return ResultVOUtils.error(
          ResultEnum.PARAM_VERIFY_FALL, bindingResult.getFieldError().getDefaultMessage());
    }

    // 先删除之前的授权
    authPermissionService.deleteByRoleId(authRoleAuthRequest.getRoleId());

    List<AuthPermission> authPermissionList =
        authRoleAuthRequest.getAuthRules().stream()
            .map(
                aLong -> {
                  AuthPermission authPermission = new AuthPermission();
                  authPermission.setRoleId(authRoleAuthRequest.getRoleId());
                  authPermission.setPermissionRuleId(aLong);
                  authPermission.setType("admin");
                  return authPermission;
                })
            .collect(Collectors.toList());

    authPermissionService.insertAuthPermissionAll(authPermissionList);

    return ResultVOUtils.success();
  }

  /**
   * 新增
   *
   * @param authRoleSaveRequest
   * @param bindingResult
   * @return
   */
  @SuppressWarnings("rawtypes")
  @AuthRuleAnnotation("admin/auth/role/save")
  @PostMapping("/admin/auth/role/save")
  public BaseResponse save(
      @RequestBody @Valid AuthRoleSaveRequest authRoleSaveRequest, BindingResult bindingResult) {

    if (bindingResult.hasErrors()) {
      return ResultVOUtils.error(
          ResultEnum.PARAM_VERIFY_FALL, bindingResult.getFieldError().getDefaultMessage());
    }

    AuthRole byName = authRoleService.findByName(authRoleSaveRequest.getName());
    if (byName != null) {
      return ResultVOUtils.error(ResultEnum.DATA_REPEAT, "当前角色已存在");
    }

    AuthRole authRole = new AuthRole();
    BeanUtils.copyProperties(authRoleSaveRequest, authRole);

    boolean b = authRoleService.insertAuthRole(authRole);
    if (!b) {
      return ResultVOUtils.error(ResultEnum.NOT_NETWORK);
    }

    Map<String, Long> res = new HashMap<>();
    res.put("id", authRole.getId());
    return ResultVOUtils.success(res);
  }

  /**
   * 编辑
   *
   * @param authRoleSaveRequest
   * @param bindingResult
   * @return
   */
  @SuppressWarnings("rawtypes")
  @AuthRuleAnnotation("admin/auth/role/edit")
  @PostMapping("/admin/auth/role/edit")
  public BaseResponse edit(
      @RequestBody @Valid AuthRoleSaveRequest authRoleSaveRequest, BindingResult bindingResult) {

    if (bindingResult.hasErrors()) {
      return ResultVOUtils.error(
          ResultEnum.PARAM_VERIFY_FALL, bindingResult.getFieldError().getDefaultMessage());
    }

    if (authRoleSaveRequest.getId() == null) {
      return ResultVOUtils.error(ResultEnum.PARAM_VERIFY_FALL);
    }

    // 检查是否存在当前角色
    AuthRole byName = authRoleService.findByName(authRoleSaveRequest.getName());
    if (byName != null && !authRoleSaveRequest.getId().equals(byName.getId())) {
      return ResultVOUtils.error(ResultEnum.DATA_REPEAT, "当前角色已存在");
    }

    AuthRole authRole = new AuthRole();
    BeanUtils.copyProperties(authRoleSaveRequest, authRole);

    boolean b = authRoleService.updateAuthRole(authRole);
    if (!b) {
      return ResultVOUtils.error(ResultEnum.NOT_NETWORK);
    }

    return ResultVOUtils.success();
  }

  /**
   * 删除
   *
   * @param authRoleSaveRequest
   * @return
   */
  @SuppressWarnings("rawtypes")
  @AuthRuleAnnotation("admin/auth/role/delete")
  @PostMapping("/admin/auth/role/delete")
  public BaseResponse delete(@RequestBody AuthRoleSaveRequest authRoleSaveRequest) {

    if (authRoleSaveRequest.getId() == null) {
      return ResultVOUtils.error(ResultEnum.PARAM_VERIFY_FALL);
    }

    boolean b = authRoleService.deleteById(authRoleSaveRequest.getId());
    if (!b) {
      return ResultVOUtils.error(ResultEnum.NOT_NETWORK);
    }

    // TODO 删除角色后先前授权的缓存不会消失

    // 再删除之前的授权
    authPermissionService.deleteByRoleId(authRoleSaveRequest.getId());

    return ResultVOUtils.success();
  }

  @GetMapping("/admin/auth/role/searchAuthority")
  public BaseResponse searchAuthority(@RequestParam("userId") String userId) {
    User user=userService.getUser(userId);
    List<Authority> authorityList = authRoleService.searchAuthority(user.getAuthority());

    return ResultVOUtils.success(authorityList);
  }

  @GetMapping("/authRole/searchRole")
  public BaseResponse searchRole() {
    List<AuthRoleResponse> authRoleList = authRoleService.searchRole();
    return ResultVOUtils.success(authRoleList);
  }

  @GetMapping("/admin/auth/role/getAuthority")
  public BaseResponse getAuthority(@RequestParam("userId") String userId) {
    User user=userService.getUser(userId);
    return ResultVOUtils.success(user);
  }
}
