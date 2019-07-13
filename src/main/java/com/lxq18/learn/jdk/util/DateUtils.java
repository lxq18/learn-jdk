package com.lxq18.learn.jdk.util;

import org.apache.commons.lang3.time.DateFormatUtils;

import java.util.Date;

/**
 * @author lxq
 * @create 2019/7/13 18:26
 */
public class DateUtils {
    public static final String DEFAULT_FORMAT = "yyyy-MM-dd HH:mm:ss";

    public static String nowString() {
        return DateFormatUtils.format(new Date(), DEFAULT_FORMAT);
    }

    public static String format(Date date) {
        return DateFormatUtils.format(date, DEFAULT_FORMAT);
    }
}
