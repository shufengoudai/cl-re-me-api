package com.amis.api.admin.util;

import com.amis.api.admin.entity.auth.AuthPermissionRule;
import com.amis.api.admin.res.auth.AuthPermissionRuleMergeResponse;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.BeanUtils;

/** 权限规则生成树形节点工具类 */
public class PermissionRuleTreeUtils {

  /** 多维数组 */
  public static List<AuthPermissionRuleMergeResponse> merge(
      List<AuthPermissionRule> authPermissionRuleList, Integer pid) {

    List<AuthPermissionRuleMergeResponse> authPermissionRuleMergeResponseList = new ArrayList<>();
    for (AuthPermissionRule v : authPermissionRuleList) {
      AuthPermissionRuleMergeResponse authPermissionRuleMergeResponse =
          new AuthPermissionRuleMergeResponse();
      BeanUtils.copyProperties(v, authPermissionRuleMergeResponse);
      if (pid.equals(v.getPid())) {
        authPermissionRuleMergeResponse.setChildren(merge(authPermissionRuleList, v.getId()));
        authPermissionRuleMergeResponseList.add(authPermissionRuleMergeResponse);
      }
    }

    return authPermissionRuleMergeResponseList;
  }
}
