package com.amis.api.common.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class TStoryDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-26T09:46:10.0603486+08:00", comments="Source Table: t_story")
    public static final TStory TStory = new TStory();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-26T09:46:10.0613486+08:00", comments="Source field: t_story.id")
    public static final SqlColumn<Object> id = TStory.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-26T09:46:10.0623492+08:00", comments="Source field: t_story.story_project_id")
    public static final SqlColumn<Object> storyProjectId = TStory.storyProjectId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-26T09:46:10.0623492+08:00", comments="Source field: t_story.story_code")
    public static final SqlColumn<Integer> storyCode = TStory.storyCode;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-26T09:46:10.0623492+08:00", comments="Source field: t_story.story_title")
    public static final SqlColumn<String> storyTitle = TStory.storyTitle;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-26T09:46:10.0623492+08:00", comments="Source field: t_story.story_type")
    public static final SqlColumn<Integer> storyType = TStory.storyType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-26T09:46:10.0623492+08:00", comments="Source field: t_story.story_status")
    public static final SqlColumn<Integer> storyStatus = TStory.storyStatus;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-26T09:46:10.0623492+08:00", comments="Source field: t_story.story_owner")
    public static final SqlColumn<Object> storyOwner = TStory.storyOwner;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-26T09:46:10.0623492+08:00", comments="Source field: t_story.story_priority")
    public static final SqlColumn<Integer> storyPriority = TStory.storyPriority;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-26T09:46:10.0633493+08:00", comments="Source field: t_story.story_point")
    public static final SqlColumn<Integer> storyPoint = TStory.storyPoint;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-26T09:46:10.0633493+08:00", comments="Source field: t_story.story_start")
    public static final SqlColumn<Date> storyStart = TStory.storyStart;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-26T09:46:10.0633493+08:00", comments="Source field: t_story.story_end")
    public static final SqlColumn<Date> storyEnd = TStory.storyEnd;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-26T09:46:10.0633493+08:00", comments="Source field: t_story.story_description")
    public static final SqlColumn<String> storyDescription = TStory.storyDescription;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-26T09:46:10.0633493+08:00", comments="Source field: t_story.story_ready")
    public static final SqlColumn<String> storyReady = TStory.storyReady;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-26T09:46:10.0633493+08:00", comments="Source field: t_story.story_done")
    public static final SqlColumn<String> storyDone = TStory.storyDone;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-26T09:46:10.0633493+08:00", comments="Source field: t_story.story_sprint")
    public static final SqlColumn<Object> storySprint = TStory.storySprint;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-26T09:46:10.0643486+08:00", comments="Source field: t_story.requirement_type")
    public static final SqlColumn<Integer> requirementType = TStory.requirementType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-26T09:46:10.0643486+08:00", comments="Source field: t_story.requirement_origin")
    public static final SqlColumn<Integer> requirementOrigin = TStory.requirementOrigin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-26T09:46:10.0643486+08:00", comments="Source field: t_story.ins_account_id")
    public static final SqlColumn<Object> insAccountId = TStory.insAccountId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-26T09:46:10.0643486+08:00", comments="Source field: t_story.ins_dt_time")
    public static final SqlColumn<Date> insDtTime = TStory.insDtTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-26T09:46:10.0643486+08:00", comments="Source field: t_story.upd_account_id")
    public static final SqlColumn<Object> updAccountId = TStory.updAccountId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-26T09:46:10.0643486+08:00", comments="Source field: t_story.upd_dt_time")
    public static final SqlColumn<Date> updDtTime = TStory.updDtTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-26T09:46:10.0643486+08:00", comments="Source field: t_story.logical_del_div")
    public static final SqlColumn<Integer> logicalDelDiv = TStory.logicalDelDiv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-26T09:46:10.0643486+08:00", comments="Source field: t_story.story_index")
    public static final SqlColumn<Integer> storyIndex = TStory.storyIndex;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-26T09:46:10.0653489+08:00", comments="Source field: t_story.story_point_actual")
    public static final SqlColumn<Integer> storyPointActual = TStory.storyPointActual;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-26T09:46:10.0653489+08:00", comments="Source field: t_story.story_business_value")
    public static final SqlColumn<String> storyBusinessValue = TStory.storyBusinessValue;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-26T09:46:10.0613486+08:00", comments="Source Table: t_story")
    public static final class TStory extends SqlTable {
        public final SqlColumn<Object> id = column("id", JDBCType.OTHER);

        public final SqlColumn<Object> storyProjectId = column("story_project_id", JDBCType.OTHER);

        public final SqlColumn<Integer> storyCode = column("story_code", JDBCType.INTEGER);

        public final SqlColumn<String> storyTitle = column("story_title", JDBCType.VARCHAR);

        public final SqlColumn<Integer> storyType = column("story_type", JDBCType.INTEGER);

        public final SqlColumn<Integer> storyStatus = column("story_status", JDBCType.INTEGER);

        public final SqlColumn<Object> storyOwner = column("story_owner", JDBCType.OTHER);

        public final SqlColumn<Integer> storyPriority = column("story_priority", JDBCType.INTEGER);

        public final SqlColumn<Integer> storyPoint = column("story_point", JDBCType.INTEGER);

        public final SqlColumn<Date> storyStart = column("story_start", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> storyEnd = column("story_end", JDBCType.TIMESTAMP);

        public final SqlColumn<String> storyDescription = column("story_description", JDBCType.VARCHAR);

        public final SqlColumn<String> storyReady = column("story_ready", JDBCType.VARCHAR);

        public final SqlColumn<String> storyDone = column("story_done", JDBCType.VARCHAR);

        public final SqlColumn<Object> storySprint = column("story_sprint", JDBCType.OTHER);

        public final SqlColumn<Integer> requirementType = column("requirement_type", JDBCType.INTEGER);

        public final SqlColumn<Integer> requirementOrigin = column("requirement_origin", JDBCType.INTEGER);

        public final SqlColumn<Object> insAccountId = column("ins_account_id", JDBCType.OTHER);

        public final SqlColumn<Date> insDtTime = column("ins_dt_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Object> updAccountId = column("upd_account_id", JDBCType.OTHER);

        public final SqlColumn<Date> updDtTime = column("upd_dt_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> logicalDelDiv = column("logical_del_div", JDBCType.INTEGER);

        public final SqlColumn<Integer> storyIndex = column("story_index", JDBCType.INTEGER);

        public final SqlColumn<Integer> storyPointActual = column("story_point_actual", JDBCType.INTEGER);

        public final SqlColumn<String> storyBusinessValue = column("story_business_value", JDBCType.VARCHAR);

        public TStory() {
            super("t_story");
        }
    }
}