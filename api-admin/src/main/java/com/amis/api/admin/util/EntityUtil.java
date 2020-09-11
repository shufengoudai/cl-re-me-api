package com.amis.api.admin.util;

import java.lang.reflect.Field;

public class EntityUtil {
    public static  <T> T clone(Object bean,Class<T> tClass){
        try {
            T entity = tClass.newInstance();
            Field[] fields = bean.getClass().getDeclaredFields();
            for(Field field:fields){
                try{
                    field.setAccessible(true);
                    Field entityField ;
                    if (bean.getClass()==tClass.getSuperclass()){ // if bean is father .
                        entityField = tClass.getSuperclass().getDeclaredField(field.getName());
                    }else {
                        entityField = tClass.getDeclaredField(field.getName());
                    }
                    entityField.setAccessible(true);
                    entityField.set(entity,field.get(bean));
                }catch (Exception none) {
                    none.printStackTrace();
                }
            }
            return entity;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
