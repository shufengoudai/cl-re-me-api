package com.amis.api.admin.service.auth.impl;

import com.amis.api.admin.entity.auth.AuthPermission;
import com.amis.api.admin.entity.auth.AuthPermissionRule;
import com.amis.api.admin.entity.auth.AuthUserRole;
import com.amis.api.admin.service.BaseServiceImpl;
import com.amis.api.admin.service.auth.AuthLoginService;
import com.amis.api.admin.service.auth.AuthPermissionRuleService;
import com.amis.api.admin.service.auth.AuthPermissionService;
import com.amis.api.admin.service.auth.AuthRoleAdminService;
import com.amis.api.admin.util.CacheUtils;
import com.amis.api.common.constant.CacheConstant;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@Slf4j
public class AuthLoginServiceImpl extends BaseServiceImpl implements AuthLoginService {

  @Resource private AuthRoleAdminService authRoleAdminService;

  @Resource private AuthPermissionService authPermissionService;

  @Resource private AuthPermissionRuleService authPermissionRuleService;

  /**
   * 根据 管理员id 获取权限
   *
   * @param adminId
   * @return
   */
  @Override
  public List<String> listRuleByAdminId(Object adminId) {

    List<String> authRules = new ArrayList<>();

    // 如果存在，先从缓存中获取权限
    String aarKey = String.format(CacheConstant.ADMIN_AUTH_RULES, adminId);
    if (CacheUtils.hasKey(aarKey)) {
      return new ArrayList<>(CacheUtils.sGetMembers(aarKey));
    }
    log.info("开始获取数据库中的用户的权限规则列表");

    // 获取角色ids
    AuthUserRole authRoleAdmin = authRoleAdminService.listByAdminId(UUID.fromString(adminId.toString()));

    if (authRoleAdmin != null) {
      Long roleId = authRoleAdmin.getRoleId();
      // 超级管理员或企业管理员
      if (roleId.equals(0L) || roleId.equals(1L)) {
        authRules.add("admin");
        return authRules;
      }
      List<Long> roleIds = new ArrayList<Long>();
      roleIds.add(roleId);

      // 角色授权列表
      List<AuthPermission> authPermissions = authPermissionService.listByRoleIdIn(roleIds);
      List<Long> permissionRuleIds =
              authPermissions.stream()
                      .map(AuthPermission::getPermissionRuleId)
                      .collect(Collectors.toList());

      // 获取授权的规则
      List<AuthPermissionRule> authPermissionRules =
              authPermissionRuleService.listByIdIn(permissionRuleIds);

      // 获取权限列表
      authRules =
              authPermissionRules.stream().map(AuthPermissionRule::getName).collect(Collectors.toList());

      // 如果为空，则添加一个空值
      if (authRules.isEmpty()) {
        authRules.add("");
      }

      String[] strings = authRules.toArray(new String[0]);
      CacheUtils.sAdd(aarKey, strings);
      CacheUtils.expire(aarKey, 7200L); // 两小时后过期
    }

    return authRules;
  }
}
