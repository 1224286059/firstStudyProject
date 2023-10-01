package com.datetest;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * jdk8之前的日期时间的API测试：
 * （1）System类中currentTimeMills();
 * (2)java.util.Date和子类java.sql.Date
 * （3）SimpleDateFormat
 * (4)Calendar
 * @author XiangChen
 * @create 2023-10-01 19:26
 */
public class DateTest {
    /*
    SimpleDateFormat:对日期Date类的格式化和解析
    （1）格式化：日期-->字符串
    （2）解析：字符串-->日期
     */
    @Test
    public void testSimpleDateformat() throws ParseException {
        //1.实例化:使用默认构造器
        SimpleDateFormat sdf = new SimpleDateFormat();
        //格式化操作
        Date date = new Date();
        System.out.println(date);
        String format = sdf.format(date);
        System.out.println(format);

        //解析
        String str = "23-10-01 下午7:37";
        Date date1 = sdf.parse(str);
        System.out.println(date1);

        //2.实例化使用参数构造器

        //解析
//        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyy.MMMMM.dd GGG hh:mm aaa");
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format1 = sdf1.format(date);
        System.out.println(format1);
        //解析
        Date date2 = sdf1.parse("2023-10-01 07:51:22");//必须与上面参数化的格式对应
        System.out.println(date2);
    }

    //练习：将字符串"2020-09-08"转换为java.sql.Date
    @Test
    public void testSimpleDateformat2() throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String str = "2020-09-08";
        Date date = dateFormat.parse(str);
//        System.out.println(date);
        System.out.println(date.getTime());
        java.sql.Date date1 = new java.sql.Date(date.getTime());
        System.out.println(date1);

    }


    //Calendar日历类（抽象类）的使用
    @Test
    public void calendarTest(){
        //实例化
        //方法一：创建其子类CregorianCalendar的对象
        //方法二：调用其静态方法getInstance()
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        //常用方法
        //get()
        int days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        //set() 这里与String中replace的方法不一样，String的replace中原本的字符是不会变得，会创造一个新的字符赋给左边；
        //这里是set（）会直接改变calendar中的值
        calendar.set(Calendar.DAY_OF_MONTH,22);
        days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);
        //add()原有基础上加多少天（减多少天，数字为负数就行）
        calendar.add(Calendar.DAY_OF_MONTH,3);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        //getTime():把日历类改为Date
        Date time = calendar.getTime();
        System.out.println(time);
        //setTime()：把Date类改为日历类
        Date date = new Date();
        calendar.setTime(date);//注意没有返回值
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

    }

}
