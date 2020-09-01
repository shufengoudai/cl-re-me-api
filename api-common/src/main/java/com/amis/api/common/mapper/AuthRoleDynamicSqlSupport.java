package com.amis.api.common.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class AuthRoleDynamicSqlSupport {

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3143018+08:00", comments = "Source Table: auth_role")
    public static final AuthRole authRole = new AuthRole();
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3153012+08:00", comments = "Source field: auth_role.id")
    public static final SqlColumn<Integer> id = authRole.id;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3153012+08:00", comments = "Source field: auth_role.name")
    public static final SqlColumn<String> name = authRole.name;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3153012+08:00", comments = "Source field: auth_role.pid")
    public static final SqlColumn<Integer> pid = authRole.pid;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3153012+08:00", comments = "Source field: auth_role.status")
    public static final SqlColumn<Short> status = authRole.status;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3153012+08:00", comments = "Source field: auth_role.remark")
    public static final SqlColumn<String> remark = authRole.remark;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3153012+08:00", comments = "Source field: auth_role.create_time")
    public static final SqlColumn<Date> createTime = authRole.createTime;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3153012+08:00", comments = "Source field: auth_role.update_time")
    public static final SqlColumn<Date> updateTime = authRole.updateTime;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3153012+08:00", comments = "Source field: auth_role.listorder")
    public static final SqlColumn<Integer> listorder = authRole.listorder;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3153012+08:00", comments = "Source Table: auth_role")
    public static final class AuthRole extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);
        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);
        public final SqlColumn<Integer> pid = column("pid", JDBCType.INTEGER);
        public final SqlColumn<Short> status = column("status", JDBCType.SMALLINT);
        public final SqlColumn<String> remark = column("remark", JDBCType.VARCHAR);
        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);
        public final SqlColumn<Date> updateTime = column("update_time", JDBCType.TIMESTAMP);
        public final SqlColumn<Integer> listorder = column("listorder", JDBCType.INTEGER);

        public AuthRole() {
            super("auth_role");
        }
    }
}
