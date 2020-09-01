package com.amis.api.common.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class TFileDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-06T09:14:33.7296447+08:00", comments="Source Table: t_file")
    public static final TFile TFile = new TFile();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-06T09:14:33.7296447+08:00", comments="Source field: t_file.id")
    public static final SqlColumn<Object> id = TFile.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-06T09:14:33.7306478+08:00", comments="Source field: t_file.file_story")
    public static final SqlColumn<Object> fileStory = TFile.fileStory;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-06T09:14:33.7306478+08:00", comments="Source field: t_file.file_task")
    public static final SqlColumn<Object> fileTask = TFile.fileTask;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-06T09:14:33.7306478+08:00", comments="Source field: t_file.file_comment")
    public static final SqlColumn<Object> fileComment = TFile.fileComment;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-06T09:14:33.7306478+08:00", comments="Source field: t_file.file_name")
    public static final SqlColumn<String> fileName = TFile.fileName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-06T09:14:33.7316484+08:00", comments="Source field: t_file.file_path")
    public static final SqlColumn<String> filePath = TFile.filePath;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-06T09:14:33.7316484+08:00", comments="Source field: t_file.ins_account_id")
    public static final SqlColumn<Object> insAccountId = TFile.insAccountId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-06T09:14:33.7316484+08:00", comments="Source field: t_file.ins_dt_time")
    public static final SqlColumn<Date> insDtTime = TFile.insDtTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-06T09:14:33.7316484+08:00", comments="Source field: t_file.upd_account_id")
    public static final SqlColumn<Object> updAccountId = TFile.updAccountId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-06T09:14:33.7316484+08:00", comments="Source field: t_file.upd_dt_time")
    public static final SqlColumn<Date> updDtTime = TFile.updDtTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-06T09:14:33.7316484+08:00", comments="Source field: t_file.logical_del_div")
    public static final SqlColumn<Integer> logicalDelDiv = TFile.logicalDelDiv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-06T09:14:33.7316484+08:00", comments="Source field: t_file.file_type")
    public static final SqlColumn<Integer> fileType = TFile.fileType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-06T09:14:33.7326464+08:00", comments="Source field: t_file.file_size")
    public static final SqlColumn<String> fileSize = TFile.fileSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-06T09:14:33.7326464+08:00", comments="Source field: t_file.file_bug")
    public static final SqlColumn<Object> fileBug = TFile.fileBug;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-06T09:14:33.7296447+08:00", comments="Source Table: t_file")
    public static final class TFile extends SqlTable {
        public final SqlColumn<Object> id = column("id", JDBCType.OTHER);

        public final SqlColumn<Object> fileStory = column("file_story", JDBCType.OTHER);

        public final SqlColumn<Object> fileTask = column("file_task", JDBCType.OTHER);

        public final SqlColumn<Object> fileComment = column("file_comment", JDBCType.OTHER);

        public final SqlColumn<String> fileName = column("file_name", JDBCType.VARCHAR);

        public final SqlColumn<String> filePath = column("file_path", JDBCType.VARCHAR);

        public final SqlColumn<Object> insAccountId = column("ins_account_id", JDBCType.OTHER);

        public final SqlColumn<Date> insDtTime = column("ins_dt_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Object> updAccountId = column("upd_account_id", JDBCType.OTHER);

        public final SqlColumn<Date> updDtTime = column("upd_dt_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> logicalDelDiv = column("logical_del_div", JDBCType.INTEGER);

        public final SqlColumn<Integer> fileType = column("file_type", JDBCType.INTEGER);

        public final SqlColumn<String> fileSize = column("file_size", JDBCType.VARCHAR);

        public final SqlColumn<Object> fileBug = column("file_bug", JDBCType.OTHER);

        public TFile() {
            super("t_file");
        }
    }
}