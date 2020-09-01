package com.amis.api.admin.aspect;

import java.lang.reflect.Method;
import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import com.amis.api.admin.annotation.AuthRuleAnnotation;
import com.amis.api.admin.exception.JsonException;
import com.amis.api.admin.service.auth.AuthLoginService;
import com.amis.api.admin.util.JwtUtils;
import com.amis.api.common.enums.ResultEnum;
import io.jsonwebtoken.Claims;

/** 登录验证 AOP */
@Aspect
@Component
public class AuthorizeAspect {

  @Resource private AuthLoginService authLoginService;

  @Pointcut("@annotation(com.amis.api.admin.annotation.AuthRuleAnnotation)")
  public void adminLoginVerify() {}

  /**
   * 登录验证
   *
   * @param joinPoint
   */
  @Before("adminLoginVerify()")
  public void doAdminAuthVerify(JoinPoint joinPoint) {

    ServletRequestAttributes attributes =
        (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
    if (attributes == null) {
      throw new JsonException(ResultEnum.NOT_NETWORK);
    }
    HttpServletRequest request = attributes.getRequest();

    String id = request.getHeader("X-Adminid");
    if (id == null) {
      throw new JsonException(ResultEnum.LOGIN_VERIFY_FALL);
    }
    String adminId = id;

    String token = request.getHeader("X-Token");
    if (token == null) {
      throw new JsonException(ResultEnum.LOGIN_VERIFY_FALL);
    }

    // 验证 token
    Claims claims = JwtUtils.parse(token);
    if (claims == null) {
      throw new JsonException(ResultEnum.LOGIN_VERIFY_FALL);
    }
    String jwtAdminId = claims.get("admin_id").toString();
    if (adminId.compareTo(jwtAdminId) != 0) {
      throw new JsonException(ResultEnum.LOGIN_VERIFY_FALL);
    }

    // 判断是否进行权限验证
    MethodSignature signature = (MethodSignature) joinPoint.getSignature();
    // 从切面中获取当前方法
    Method method = signature.getMethod();
    // 得到了方,提取出他的注解
    AuthRuleAnnotation action = method.getAnnotation(AuthRuleAnnotation.class);
    // 进行权限验证
    authRuleVerify(action.value(), adminId);
  }

  /**
   * 权限验证.
   *
   * @param authRule authRule
   */
  private void authRuleVerify(String authRule, String adminId) {

    if (authRule != null && authRule.length() > 0) {

      List<String> authRules = authLoginService.listRuleByAdminId(adminId);
      // admin 为最高权限
      for (String item : authRules) {
        if (item.equals("admin") || item.equals(authRule)) {
          return;
        }
      }
      throw new JsonException(ResultEnum.AUTH_FAILED);
    }
  }
}
