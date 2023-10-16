package com.datetest;

import org.junit.Test;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

/**
 * @author XiangChen
 * @create 2023-10-02 14:13
 */
public class InstantTest {

    @Test
    public void test1(){
        //初始化Instant，获取本初子午线的标准时间
        Instant instant = Instant.now();
        System.out.println(instant);//2023-10-02T06:15:01.372Z 本初子午线的时间

        //增加时间的偏移量
        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);//2023-10-02T14:19:54.446+08:00

        //获取1970年1月1日0分0秒（UCT）开始的毫秒数  --->类似Date类中的getTime（）
        long epochMilli = instant.toEpochMilli();
        System.out.println(epochMilli);

        //通过Instant.ofEpochMilli进行实例化 --->类似于Date(long millis)
        Instant instant1 = Instant.ofEpochMilli(1696227764463L);
        System.out.println(instant1);

    }
}
