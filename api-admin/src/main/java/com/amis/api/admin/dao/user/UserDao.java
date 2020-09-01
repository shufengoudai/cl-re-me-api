package com.amis.api.admin.dao.user;

import com.amis.api.admin.entity.user.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Mapper
public interface UserDao {

    List<User> listUser(@Param("companyId") UUID companyId);

    User getUser(@Param("id") UUID id);

    boolean updateByCompany(@Param("id") UUID id,@Param("updAccountId") UUID updAccountId,@Param("date") Date date);
}
