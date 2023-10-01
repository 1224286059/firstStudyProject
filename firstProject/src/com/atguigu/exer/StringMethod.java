package com.atguigu.exer;

import org.junit.Test;

/**
 * @author XiangChen
 * @create 2023-09-25 16:23
 */
public class StringMethod {

    @Test
    public  void test1(){
        String s1 = "HelloWord";
        System.out.println(s1.length());
        System.out.println(s1.charAt(0));
        System.out.println(s1.isEmpty());

        String s2 = s1.toLowerCase();
        System.out.println(s1);//体现s1的不可变，仍然为原来的字符串
        System.out.println(s2);//改成小写

        String s3  = "  hello word   ";
        String s4 = s3.trim();
        System.out.println("--" + s3 + "--");
        System.out.println("--" + s4 + "--");

        System.out.println(s3.equals("  hello word   "));//比较字符串的内容值

        System.out.println(s3.substring(5));
        System.out.println(s3.substring(5,8));//是一个左闭右开的情况[5,8）


    }
}
