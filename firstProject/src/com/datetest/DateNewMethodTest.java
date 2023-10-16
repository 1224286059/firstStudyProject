package com.datetest;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author XiangChen
 * @create 2023-10-02 13:39
 *
 * JDK8的方法
 */
public class DateNewMethodTest {

    @Test
    public void testDate(){
        //使用now方法调用
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);

        //of()方法
        LocalDateTime localDateTime1 = LocalDateTime.of(2023, 10, 2, 13, 54);
        System.out.println(localDateTime1);

        //getXxx()方法
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getMonthValue());
        System.out.println(localDateTime.getHour());

        //withXxx()方法:设置操作  体现了不可变性，原本的不会改变
        LocalDateTime localDateTime2 = localDateTime.withHour(20);
        System.out.println(localDateTime);
        System.out.println(localDateTime2);

        //plusXxxx()：加操作
        LocalDateTime localDateTime3 = localDateTime.plusDays(2);
        System.out.println(localDateTime);
        System.out.println(localDateTime3);

        //minusXxxx():减操作
        LocalDateTime localDateTime4 = localDateTime.minusDays(6);
        System.out.println(localDateTime4);
        System.out.println(localDateTime);


    }
}
