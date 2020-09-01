package com.amis.api.admin.dao.auth;

import com.amis.api.admin.entity.auth.AuthRole;
import com.amis.api.admin.entity.auth.Authority;
import com.amis.api.admin.req.auth.AuthRoleQueryRequest;
import java.util.List;
import com.amis.api.admin.res.auth.AuthRoleResponse;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AuthRoleDao {

  /**
   * 后台管理业务查询列表
   *
   * @return 列表
   */
  List<AuthRole> listAdminPage(AuthRoleQueryRequest authRoleQueryRequest);

  /**
   * 返回id,name 字段的列表
   *
   * @return 列表
   */
  List<AuthRole> listAuthAdminRolePage(Integer status);

  AuthRole findByName(String name);

  /**
   * 插入
   *
   * @param authAdmin
   * @return
   */
  boolean insertAuthRole(AuthRole authAdmin);

  /**
   * 更新
   *
   * @param authAdmin
   * @return
   */
  boolean updateAuthRole(AuthRole authAdmin);

  /**
   * 删除
   *
   * @param id
   * @return
   */
  boolean deleteById(Long id);

  List<Authority> searchAuthority(@Param("authority") Integer authority);

  List<AuthRoleResponse> searchRole();

}
