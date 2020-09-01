package com.amis.api.common.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class AuthPermissionDynamicSqlSupport {

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3083055+08:00", comments = "Source Table: auth_permission")
    public static final AuthPermission authPermission = new AuthPermission();
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.309305+08:00", comments = "Source field: auth_permission.role_id")
    public static final SqlColumn<Integer> roleId = authPermission.roleId;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.309305+08:00", comments = "Source field: auth_permission.permission_rule_id")
    public static final SqlColumn<Integer> permissionRuleId = authPermission.permissionRuleId;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.309305+08:00", comments = "Source field: auth_permission.type")
    public static final SqlColumn<String> type = authPermission.type;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.309305+08:00", comments = "Source Table: auth_permission")
    public static final class AuthPermission extends SqlTable {
        public final SqlColumn<Integer> roleId = column("role_id", JDBCType.INTEGER);
        public final SqlColumn<Integer> permissionRuleId = column("permission_rule_id", JDBCType.INTEGER);
        public final SqlColumn<String> type = column("type", JDBCType.VARCHAR);

        public AuthPermission() {
            super("auth_permission");
        }
    }
}
