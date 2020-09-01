package com.amis.api.admin.util;

import com.amis.api.common.mapper.MessageMasterDynamicSqlSupport;
import com.amis.api.common.mapper.MessageMasterMapper;
import com.amis.api.common.model.MessageMaster;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.Optional;

/**
 * 根据语种，获取相应的报错信息
 */
@Component
public class MessageUtil {
    @Resource
    private MessageMasterMapper messageMasterMapper;

    protected static MessageUtil messageUtil;

    @PostConstruct
    public void init() {
        messageUtil = this;
        messageUtil.messageMasterMapper = this.messageMasterMapper;
    }

    /**
     * 根据messageMaster表的主键，检索messageText
     * @param messageType
     * @param messageId
     * @param messageLang
     * @return
     */
    public static String getMessage(String messageType,Integer messageId,Integer messageLang){
        String message=null;
        SelectStatementProvider selectStatement = SqlBuilder.select(MessageMasterDynamicSqlSupport.messageText)
                .from(MessageMasterDynamicSqlSupport.messageMaster)
                .where(MessageMasterDynamicSqlSupport.messageType,SqlBuilder.isEqualTo(messageType))
                .and(MessageMasterDynamicSqlSupport.messageId,SqlBuilder.isEqualTo(messageId))
                .and(MessageMasterDynamicSqlSupport.messageLang,SqlBuilder.isEqualTo(messageLang))
                .and(MessageMasterDynamicSqlSupport.logicalDelDiv,SqlBuilder.isEqualTo(0)).build()
                .render(RenderingStrategies.MYBATIS3);
        Optional<MessageMaster> opt=messageUtil.messageMasterMapper.selectOne(selectStatement);
        if(opt.isPresent()){
            message=opt.get().getMessageText();
        }
        return message;
    }
}
