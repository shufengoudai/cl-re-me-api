package com.amis.api.common.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MessageMasterDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-17T15:58:23.2601663+08:00", comments="Source Table: message_master")
    public static final MessageMaster messageMaster = new MessageMaster();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-17T15:58:23.2611498+08:00", comments="Source field: message_master.message_type")
    public static final SqlColumn<String> messageType = messageMaster.messageType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-17T15:58:23.2621496+08:00", comments="Source field: message_master.message_id")
    public static final SqlColumn<Integer> messageId = messageMaster.messageId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-17T15:58:23.2621496+08:00", comments="Source field: message_master.message_lang")
    public static final SqlColumn<Integer> messageLang = messageMaster.messageLang;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-17T15:58:23.2621496+08:00", comments="Source field: message_master.message_text")
    public static final SqlColumn<String> messageText = messageMaster.messageText;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-17T15:58:23.2621496+08:00", comments="Source field: message_master.ins_account_id")
    public static final SqlColumn<Object> insAccountId = messageMaster.insAccountId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-17T15:58:23.2621496+08:00", comments="Source field: message_master.ins_dt_time")
    public static final SqlColumn<Date> insDtTime = messageMaster.insDtTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-17T15:58:23.2621496+08:00", comments="Source field: message_master.upd_account_id")
    public static final SqlColumn<Object> updAccountId = messageMaster.updAccountId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-17T15:58:23.2621496+08:00", comments="Source field: message_master.upd_dt_time")
    public static final SqlColumn<Date> updDtTime = messageMaster.updDtTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-17T15:58:23.2631476+08:00", comments="Source field: message_master.logical_del_div")
    public static final SqlColumn<Integer> logicalDelDiv = messageMaster.logicalDelDiv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-17T15:58:23.2601663+08:00", comments="Source Table: message_master")
    public static final class MessageMaster extends SqlTable {
        public final SqlColumn<String> messageType = column("message_type", JDBCType.VARCHAR);

        public final SqlColumn<Integer> messageId = column("message_id", JDBCType.INTEGER);

        public final SqlColumn<Integer> messageLang = column("message_lang", JDBCType.INTEGER);

        public final SqlColumn<String> messageText = column("message_text", JDBCType.VARCHAR);

        public final SqlColumn<Object> insAccountId = column("ins_account_id", JDBCType.OTHER);

        public final SqlColumn<Date> insDtTime = column("ins_dt_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Object> updAccountId = column("upd_account_id", JDBCType.OTHER);

        public final SqlColumn<Date> updDtTime = column("upd_dt_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> logicalDelDiv = column("logical_del_div", JDBCType.INTEGER);

        public MessageMaster() {
            super("message_master");
        }
    }
}