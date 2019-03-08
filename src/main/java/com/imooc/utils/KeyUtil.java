package com.imooc.utils;

import java.util.Random;

public class KeyUtil {

    public static synchronized String getUniqueKey() {

        Random random = new Random();

        Integer number = random.nextInt(90000) + 10000;

        return System.currentTimeMillis() + String.valueOf(number);
    }
}
