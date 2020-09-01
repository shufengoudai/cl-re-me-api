package com.amis.api.admin.controller.auth;

import com.amis.api.admin.annotation.AuthRuleAnnotation;
import com.amis.api.admin.controller.BaseController;
import com.amis.api.admin.entity.auth.AuthPermissionRule;
import com.amis.api.admin.req.auth.AuthPermissionRuleSaveRequest;
import com.amis.api.admin.res.auth.AuthPermissionRuleMergeResponse;
import com.amis.api.admin.service.auth.AuthPermissionRuleService;
import com.amis.api.admin.util.PermissionRuleTreeUtils;
import com.amis.api.common.enums.ResultEnum;
import com.amis.api.common.res.BaseResponse;
import com.amis.api.common.util.ResultVOUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** 权限规则相关 */
@RestController
public class AuthPermissionRuleController extends BaseController {

  @Resource private AuthPermissionRuleService authPermissionRuleService;

  /**
   * 列表
   *
   * @return
   */
  @SuppressWarnings("rawtypes")
  @AuthRuleAnnotation("admin/auth/permission_rule/index")
  @GetMapping("/admin/auth/permission_rule/index")
  public BaseResponse index() {

    List<AuthPermissionRule> authPermissionRuleList = authPermissionRuleService.listAll();
    List<AuthPermissionRuleMergeResponse> merge =
        PermissionRuleTreeUtils.merge(authPermissionRuleList, 0);

    Map<String, Object> restMap = new HashMap<>();
    restMap.put("list", merge);
    return ResultVOUtils.success(restMap);
  }

  /**
   * 新增
   *
   * @param authPermissionRuleSaveRequest
   * @param bindingResult
   * @return
   */
  @SuppressWarnings("rawtypes")
  @AuthRuleAnnotation("admin/auth/permission_rule/save")
  @PostMapping("/admin/auth/permission_rule/save")
  public BaseResponse save(
      @RequestBody @Valid AuthPermissionRuleSaveRequest authPermissionRuleSaveRequest,
      BindingResult bindingResult) {

    if (bindingResult.hasErrors()) {
      return ResultVOUtils.error(
          ResultEnum.PARAM_VERIFY_FALL, bindingResult.getFieldError().getDefaultMessage());
    }

    if (authPermissionRuleSaveRequest.getPid() == null) {
      authPermissionRuleSaveRequest.setPid(0L); // 默认设置
    }
    AuthPermissionRule authPermissionRule = new AuthPermissionRule();
    BeanUtils.copyProperties(authPermissionRuleSaveRequest, authPermissionRule);

    boolean b = authPermissionRuleService.insertAuthPermissionRule(authPermissionRule);
    if (!b) {
      return ResultVOUtils.error(ResultEnum.NOT_NETWORK);
    }

    Map<String, Integer> res = new HashMap<>();
    res.put("id", authPermissionRule.getId());
    return ResultVOUtils.success(res);
  }

  /**
   * 编辑
   *
   * @param authPermissionRuleSaveRequest
   * @param bindingResult
   * @return
   */
  @SuppressWarnings("rawtypes")
  @AuthRuleAnnotation("admin/auth/permission_rule/edit")
  @PostMapping("/admin/auth/permission_rule/edit")
  public BaseResponse edit(
      @RequestBody @Valid AuthPermissionRuleSaveRequest authPermissionRuleSaveRequest,
      BindingResult bindingResult) {

    if (bindingResult.hasErrors()) {
      return ResultVOUtils.error(
          ResultEnum.PARAM_VERIFY_FALL, bindingResult.getFieldError().getDefaultMessage());
    }

    if (authPermissionRuleSaveRequest.getId() == null) {
      return ResultVOUtils.error(ResultEnum.PARAM_VERIFY_FALL);
    }

    authPermissionRuleSaveRequest.setPid(null); // 不能修改父级 pid

    AuthPermissionRule authPermissionRule = new AuthPermissionRule();
    BeanUtils.copyProperties(authPermissionRuleSaveRequest, authPermissionRule);

    boolean b = authPermissionRuleService.updateAuthPermissionRule(authPermissionRule);
    if (!b) {
      return ResultVOUtils.error(ResultEnum.NOT_NETWORK);
    }

    return ResultVOUtils.success();
  }

  /**
   * 删除
   *
   * @param authPermissionRuleSaveRequest
   * @return
   */
  @SuppressWarnings("rawtypes")
  @AuthRuleAnnotation("admin/auth/permission_rule/delete")
  @PostMapping("/admin/auth/permission_rule/delete")
  public BaseResponse delete(
      @RequestBody AuthPermissionRuleSaveRequest authPermissionRuleSaveRequest) {

    if (authPermissionRuleSaveRequest.getId() == null) {
      return ResultVOUtils.error(ResultEnum.PARAM_VERIFY_FALL);
    }

    boolean b = authPermissionRuleService.deleteById(authPermissionRuleSaveRequest.getId());
    if (!b) {
      return ResultVOUtils.error(ResultEnum.NOT_NETWORK);
    }

    return ResultVOUtils.success();
  }
}
