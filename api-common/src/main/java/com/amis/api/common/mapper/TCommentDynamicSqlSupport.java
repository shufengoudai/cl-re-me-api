package com.amis.api.common.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class TCommentDynamicSqlSupport {

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.702427+08:00", comments = "Source Table: t_comment")
    public static final TComment TComment = new TComment();
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.702427+08:00", comments = "Source field: t_comment.id")
    public static final SqlColumn<Object> id = TComment.id;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.702427+08:00", comments = "Source field: t_comment.comment_type")
    public static final SqlColumn<Integer> commentType = TComment.commentType;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.702427+08:00", comments = "Source field: t_comment.comment_relative_id")
    public static final SqlColumn<Object> commentRelativeId = TComment.commentRelativeId;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.702427+08:00", comments = "Source field: t_comment.comment_info")
    public static final SqlColumn<String> commentInfo = TComment.commentInfo;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.702427+08:00", comments = "Source field: t_comment.comment_account")
    public static final SqlColumn<Object> commentAccount = TComment.commentAccount;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.702427+08:00", comments = "Source field: t_comment.comment_date")
    public static final SqlColumn<Date> commentDate = TComment.commentDate;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.702427+08:00", comments = "Source field: t_comment.ins_account_id")
    public static final SqlColumn<Object> insAccountId = TComment.insAccountId;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.702427+08:00", comments = "Source field: t_comment.ins_dt_time")
    public static final SqlColumn<Date> insDtTime = TComment.insDtTime;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.702427+08:00", comments = "Source field: t_comment.upd_account_id")
    public static final SqlColumn<Object> updAccountId = TComment.updAccountId;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.702427+08:00", comments = "Source field: t_comment.upd_dt_time")
    public static final SqlColumn<Date> updDtTime = TComment.updDtTime;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.702427+08:00", comments = "Source field: t_comment.logical_del_div")
    public static final SqlColumn<Integer> logicalDelDiv = TComment.logicalDelDiv;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.702427+08:00", comments = "Source Table: t_comment")
    public static final class TComment extends SqlTable {
        public final SqlColumn<Object> id = column("id", JDBCType.OTHER);
        public final SqlColumn<Integer> commentType = column("comment_type", JDBCType.INTEGER);
        public final SqlColumn<Object> commentRelativeId = column("comment_relative_id", JDBCType.OTHER);
        public final SqlColumn<String> commentInfo = column("comment_info", JDBCType.VARCHAR);
        public final SqlColumn<Object> commentAccount = column("comment_account", JDBCType.OTHER);
        public final SqlColumn<Date> commentDate = column("comment_date", JDBCType.TIMESTAMP);
        public final SqlColumn<Object> insAccountId = column("ins_account_id", JDBCType.OTHER);
        public final SqlColumn<Date> insDtTime = column("ins_dt_time", JDBCType.TIMESTAMP);
        public final SqlColumn<Object> updAccountId = column("upd_account_id", JDBCType.OTHER);
        public final SqlColumn<Date> updDtTime = column("upd_dt_time", JDBCType.TIMESTAMP);
        public final SqlColumn<Integer> logicalDelDiv = column("logical_del_div", JDBCType.INTEGER);

        public TComment() {
            super("t_comment");
        }
    }
}
