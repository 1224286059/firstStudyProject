package com.datetest;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;

/**
 * @author XiangChen
 * @create 2023-10-02 14:29
 */
public class DateTimeFormatterTest {

    //方法一
    @Test
    public void test(){
        DateTimeFormatter isoOffsetDateTime = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        LocalDateTime localDateTime = LocalDateTime.now();
        //格式化：将日期-->字符串
        String str = isoOffsetDateTime.format(localDateTime);
        System.out.println(localDateTime);
//        System.out.println(localDateTime.toString());
        System.out.println(str);
        //解析：字符串到日期
        TemporalAccessor parse = isoOffsetDateTime.parse(str);
        System.out.println(parse);
    }

    //方法二
    /*
    本地化相关格式：DateTimeFormatter.ofLocalizedDateTime/ofLocalizedDate等
    FormatStyle.SHORT/FormatStyle.MEDIUM/FormatStyle.LONG/：适用于LocalDateTime
     */
    @Test
    public void test2(){

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        LocalDateTime localDateTime = LocalDateTime.now();
        String str = dateTimeFormatter.format(localDateTime);
        System.out.println(str);
    }

    //方法三
    /*
    自定义方法：ofPattern("yyyy-MM-dd hh:mm:ss E")
     */
    @Test
    public  void test3(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss E");//E代表星期几
        //格式化
        String str = formatter.format(LocalDateTime.now());
        System.out.println(str);
        //解析
        TemporalAccessor parse = formatter.parse("2023-10-02 02:54:25 星期一");
        System.out.println(parse);
    }
}
