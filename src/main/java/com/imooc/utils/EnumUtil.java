package com.imooc.utils;

import com.imooc.enums.CodeEnum;

/**
 * Created by 李新宇
 * 2019-03-19 23:21
 */
public class EnumUtil {

    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass) {
        for (T each : enumClass.getEnumConstants()) {
            if (code.equals(each.getCode())) {
                return each;
            }
        }
        return null;
    }
}
