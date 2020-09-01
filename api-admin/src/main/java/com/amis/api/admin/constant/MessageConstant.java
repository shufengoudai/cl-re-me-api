package com.amis.api.admin.constant;

/**
 * message_master相关
 */
public interface MessageConstant {
    //request header token常量
    String token="X-Token";
    //messageType
    String messageError="error";

    String messageSuccess="success";

    String messageWarning="warning";

    String messageInfo="info";

    //messageId
    Integer success = 2021000;

    Integer notNetWork = 2021001;

    Integer loginVerityFall = 2021002;

    Integer paramVerityFall = 2021003;

    Integer authFailed = 2021004;

    Integer loginError = 2021005;

    Integer dataChange = 2021006;

    Integer dataRepeat = 2021007;

    Integer exclusionError = 2021008;

    Integer duplicateUsername = 2021009;

    Integer duplicateIdentify = 2021010;

    Integer dataNot = 2021011;

    Integer operateError = 2021012;

    Integer duplicateCompanyIdentify = 2021013;

}
