package com.amis.api.common.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class TUserDynamicSqlSupport {

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6293035+08:00", comments = "Source Table: t_user")
    public static final TUser TUser = new TUser();
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6293035+08:00", comments = "Source field: t_user.id")
    public static final SqlColumn<Object> id = TUser.id;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6303019+08:00", comments = "Source field: t_user.user_name")
    public static final SqlColumn<String> userName = TUser.userName;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6303019+08:00", comments = "Source field: t_user.user_fullname")
    public static final SqlColumn<String> userFullname = TUser.userFullname;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6303019+08:00", comments = "Source field: t_user.password")
    public static final SqlColumn<String> password = TUser.password;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6303019+08:00", comments = "Source field: t_user.authority")
    public static final SqlColumn<Integer> authority = TUser.authority;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6303019+08:00", comments = "Source field: t_user.position")
    public static final SqlColumn<String> position = TUser.position;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6303019+08:00", comments = "Source field: t_user.user_mail")
    public static final SqlColumn<String> userMail = TUser.userMail;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6303019+08:00", comments = "Source field: t_user.user_tel")
    public static final SqlColumn<String> userTel = TUser.userTel;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6303019+08:00", comments = "Source field: t_user.user_depart")
    public static final SqlColumn<String> userDepart = TUser.userDepart;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6313005+08:00", comments = "Source field: t_user.user_sex")
    public static final SqlColumn<Integer> userSex = TUser.userSex;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6313005+08:00", comments = "Source field: t_user.user_notify")
    public static final SqlColumn<Integer> userNotify = TUser.userNotify;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6313005+08:00", comments = "Source field: t_user.ins_account_id")
    public static final SqlColumn<Object> insAccountId = TUser.insAccountId;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6313005+08:00", comments = "Source field: t_user.ins_dt_time")
    public static final SqlColumn<Date> insDtTime = TUser.insDtTime;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6313005+08:00", comments = "Source field: t_user.upd_account_id")
    public static final SqlColumn<Object> updAccountId = TUser.updAccountId;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6313005+08:00", comments = "Source field: t_user.upd_dt_time")
    public static final SqlColumn<Date> updDtTime = TUser.updDtTime;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6313005+08:00", comments = "Source field: t_user.logical_del_div")
    public static final SqlColumn<Integer> logicalDelDiv = TUser.logicalDelDiv;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6313005+08:00", comments = "Source field: t_user.company_id")
    public static final SqlColumn<Object> companyId = TUser.companyId;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6313005+08:00", comments = "Source field: t_user.auth_type")
    public static final SqlColumn<Integer> authType = TUser.authType;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6293035+08:00", comments = "Source Table: t_user")
    public static final class TUser extends SqlTable {
        public final SqlColumn<Object> id = column("id", JDBCType.OTHER);
        public final SqlColumn<String> userName = column("user_name", JDBCType.VARCHAR);
        public final SqlColumn<String> userFullname = column("user_fullname", JDBCType.VARCHAR);
        public final SqlColumn<String> password = column("password", JDBCType.VARCHAR);
        public final SqlColumn<Integer> authority = column("authority", JDBCType.INTEGER);
        public final SqlColumn<String> position = column("position", JDBCType.INTEGER);
        public final SqlColumn<String> userMail = column("user_mail", JDBCType.VARCHAR);
        public final SqlColumn<String> userTel = column("user_tel", JDBCType.VARCHAR);
        public final SqlColumn<String> userDepart = column("user_depart", JDBCType.VARCHAR);
        public final SqlColumn<Integer> userSex = column("user_sex", JDBCType.INTEGER);
        public final SqlColumn<Integer> userNotify = column("user_notify", JDBCType.INTEGER);
        public final SqlColumn<Object> insAccountId = column("ins_account_id", JDBCType.INTEGER);
        public final SqlColumn<Date> insDtTime = column("ins_dt_time", JDBCType.TIMESTAMP);
        public final SqlColumn<Object> updAccountId = column("upd_account_id", JDBCType.INTEGER);
        public final SqlColumn<Date> updDtTime = column("upd_dt_time", JDBCType.TIMESTAMP);
        public final SqlColumn<Integer> logicalDelDiv = column("logical_del_div", JDBCType.INTEGER);
        public final SqlColumn<Object> companyId = column("company_id", JDBCType.OTHER);
        public final SqlColumn<Integer> authType = column("auth_type", JDBCType.INTEGER);

        public TUser() {
            super("t_user");
        }
    }
}
