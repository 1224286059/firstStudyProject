package com.java2;


import org.junit.Test;

import java.util.Date;

/**
 * Author: CodeChen
 * Date: 2023-09-27 10:20
 * Description:
 **/
public class DateTimeTest {
    /*
    java.util.Date类
            /--java.sql.Date类
     1.两个构造器的使用
        *构造器一：Date()创建当前时间的对象
        *构造器二：Date(毫秒数)：创建指定毫秒数的对象
     2.两个方法的使用
        *toString():显示年/月/日/时/分/秒
        *getTime():获取当前的时间戳

     3.java.sql.Date类：对应数据库中日期类型的变量
        *如何实例化
        *如何将java.Util.Date()转化为java.sql.Date()
     */
    @Test
    public void test2(){
        //构造器一：Date() 创建一个当前时间的Date对象
        Date date1 = new Date();
        System.out.println(date1.toString());//Wed Sep 27 10:32:44 CST 2023

        System.out.println(date1.getTime());//1695782102595

        //构造器2 :创建指定毫秒数的Date对象
        Date date2 = new Date(1695782102595L);//Wed Sep 27 10:35:02 CST 2023
        System.out.println(date2.toString());

        java.sql.Date date3 = new java.sql.Date(1695782102595L);
        System.out.println(date3);

        //如何将java.Util.Date()转化为java.sql.Date()
        //情况一：多态
        Date date4 = new java.sql.Date(1695782102595L);
        java.sql.Date date5 = (java.sql.Date)date4;
        //情况二：
        Date date6 = new Date();


    }

    @Test
    public void test1(){
        long time = System.currentTimeMillis();
        //时间戳
        System.out.println(time);
    }
}
