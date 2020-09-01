package com.amis.api.admin.util;

public class LangUtil {

    /**
     * 根据用户token，取得用户登录时塞到redis的语种
     * @param token
     * @return
     */
    public static Integer getLangFromRedis(String token){
        //默认返回中文
        Integer lang=0;
        Object value = CacheUtils.get(token);
        //取到数据的时候，lang改成取到的值
        if(value!=null){
            lang = (Integer.parseInt(value.toString()));
        }
        return lang;
    }

}
