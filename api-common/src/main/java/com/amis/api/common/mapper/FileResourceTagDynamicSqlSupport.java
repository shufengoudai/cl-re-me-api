package com.amis.api.common.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class FileResourceTagDynamicSqlSupport {

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3272937+08:00", comments = "Source Table: file_resource_tag")
    public static final FileResourceTag fileResourceTag = new FileResourceTag();
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3272937+08:00", comments = "Source field: file_resource_tag.id")
    public static final SqlColumn<Integer> id = fileResourceTag.id;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3272937+08:00", comments = "Source field: file_resource_tag.tag")
    public static final SqlColumn<String> tag = fileResourceTag.tag;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3272937+08:00", comments = "Source field: file_resource_tag.create_time")
    public static final SqlColumn<Date> createTime = fileResourceTag.createTime;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3272937+08:00", comments = "Source Table: file_resource_tag")
    public static final class FileResourceTag extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);
        public final SqlColumn<String> tag = column("tag", JDBCType.VARCHAR);
        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public FileResourceTag() {
            super("file_resource_tag");
        }
    }
}
