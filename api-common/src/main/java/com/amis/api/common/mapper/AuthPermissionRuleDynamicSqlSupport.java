package com.amis.api.common.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class AuthPermissionRuleDynamicSqlSupport {

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3113031+08:00", comments = "Source Table: auth_permission_rule")
    public static final AuthPermissionRule authPermissionRule = new AuthPermissionRule();
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3113031+08:00", comments = "Source field: auth_permission_rule.id")
    public static final SqlColumn<Integer> id = authPermissionRule.id;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3113031+08:00", comments = "Source field: auth_permission_rule.pid")
    public static final SqlColumn<Integer> pid = authPermissionRule.pid;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3113031+08:00", comments = "Source field: auth_permission_rule.name")
    public static final SqlColumn<String> name = authPermissionRule.name;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3113031+08:00", comments = "Source field: auth_permission_rule.title")
    public static final SqlColumn<String> title = authPermissionRule.title;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3123028+08:00", comments = "Source field: auth_permission_rule.status")
    public static final SqlColumn<Short> status = authPermissionRule.status;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3123028+08:00", comments = "Source field: auth_permission_rule.condition")
    public static final SqlColumn<String> condition = authPermissionRule.condition;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3123028+08:00", comments = "Source field: auth_permission_rule.listorder")
    public static final SqlColumn<Integer> listorder = authPermissionRule.listorder;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3123028+08:00", comments = "Source field: auth_permission_rule.create_time")
    public static final SqlColumn<Date> createTime = authPermissionRule.createTime;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3123028+08:00", comments = "Source field: auth_permission_rule.update_time")
    public static final SqlColumn<Date> updateTime = authPermissionRule.updateTime;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3113031+08:00", comments = "Source Table: auth_permission_rule")
    public static final class AuthPermissionRule extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);
        public final SqlColumn<Integer> pid = column("pid", JDBCType.INTEGER);
        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);
        public final SqlColumn<String> title = column("title", JDBCType.VARCHAR);
        public final SqlColumn<Short> status = column("status", JDBCType.SMALLINT);
        public final SqlColumn<String> condition = column("condition", JDBCType.VARCHAR);
        public final SqlColumn<Integer> listorder = column("listorder", JDBCType.INTEGER);
        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);
        public final SqlColumn<Date> updateTime = column("update_time", JDBCType.TIMESTAMP);

        public AuthPermissionRule() {
            super("auth_permission_rule");
        }
    }
}
