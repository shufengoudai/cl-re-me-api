package com.amis.api.admin.dao.auth;

import com.amis.api.admin.entity.auth.AuthUserRole;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AuthUserRoleDao {

  /**
   * 根据 adminId 查询
   *
   * @param adminId 传入的 adminId
   * @return
   */
  AuthUserRole listByAdminId(Object adminId);

  /**
   * 根据 多个 adminId 查询
   *
   * @param adminIds 传入的 adminIds
   * @return
   */
  List<AuthUserRole> listByAdminIdIn(List<Object> adminIds);

  /**
   * 根据 role_id 查询 admin_id
   *
   * @param roleId 传入的 roleId
   * @return
   */
  List<AuthUserRole> listByRoleId(Long roleId);

  /**
   * 批量插入
   *
   * @param authRoleAdminList
   * @return
   */
  int insertAuthRoleAdminAll(List<AuthUserRole> authRoleAdminList);

  /**
   * 根据 adminId 删除
   *
   * @param adminId
   * @return
   */
  boolean deleteByAdminId(Object adminId);
}
