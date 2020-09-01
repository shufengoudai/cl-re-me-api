package com.amis.api.common.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class TNotificationHistoryDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-07-22T17:45:46.0372796+08:00", comments="Source Table: t_notification_history")
    public static final TNotificationHistory TNotificationHistory = new TNotificationHistory();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-07-22T17:45:46.0372796+08:00", comments="Source field: t_notification_history.id")
    public static final SqlColumn<Object> id = TNotificationHistory.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-07-22T17:45:46.0372796+08:00", comments="Source field: t_notification_history.notify_member")
    public static final SqlColumn<Object> notifyMember = TNotificationHistory.notifyMember;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-07-22T17:45:46.0372796+08:00", comments="Source field: t_notification_history.notify_content")
    public static final SqlColumn<String> notifyContent = TNotificationHistory.notifyContent;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-07-22T17:45:46.0372796+08:00", comments="Source field: t_notification_history.notify_time")
    public static final SqlColumn<Date> notifyTime = TNotificationHistory.notifyTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-07-22T17:45:46.0372796+08:00", comments="Source field: t_notification_history.ins_account_id")
    public static final SqlColumn<Object> insAccountId = TNotificationHistory.insAccountId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-07-22T17:45:46.0372796+08:00", comments="Source field: t_notification_history.ins_dt_time")
    public static final SqlColumn<Date> insDtTime = TNotificationHistory.insDtTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-07-22T17:45:46.0372796+08:00", comments="Source field: t_notification_history.upd_account_id")
    public static final SqlColumn<Object> updAccountId = TNotificationHistory.updAccountId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-07-22T17:45:46.0382787+08:00", comments="Source field: t_notification_history.upd_dt_time")
    public static final SqlColumn<Date> updDtTime = TNotificationHistory.updDtTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-07-22T17:45:46.0382787+08:00", comments="Source field: t_notification_history.logical_del_div")
    public static final SqlColumn<Integer> logicalDelDiv = TNotificationHistory.logicalDelDiv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-07-22T17:45:46.0372796+08:00", comments="Source Table: t_notification_history")
    public static final class TNotificationHistory extends SqlTable {
        public final SqlColumn<Object> id = column("id", JDBCType.OTHER);

        public final SqlColumn<Object> notifyMember = column("notify_member", JDBCType.OTHER);

        public final SqlColumn<String> notifyContent = column("notify_content", JDBCType.VARCHAR);

        public final SqlColumn<Date> notifyTime = column("notify_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Object> insAccountId = column("ins_account_id", JDBCType.OTHER);

        public final SqlColumn<Date> insDtTime = column("ins_dt_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Object> updAccountId = column("upd_account_id", JDBCType.OTHER);

        public final SqlColumn<Date> updDtTime = column("upd_dt_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> logicalDelDiv = column("logical_del_div", JDBCType.INTEGER);

        public TNotificationHistory() {
            super("t_notification_history");
        }
    }
}