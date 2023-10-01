package com.atguigu.exer;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author XiangChen
 * @create 2023-09-25 17:04
 */
public class StringTest2 {

    //String与char[]之间的转换
    @Test
    public void test2(){
        String s1 = "abc";
        char[] charArray = s1.toCharArray();
        for (int i = 0;i <charArray.length;i++){
            System.out.println(charArray[i]);
        }

        char[] arr = new char[]{'h','e','l','l','o'};
        String s2 = new String(arr);
        System.out.println(s2);
    }

    //String与byte[]之间的转换
    @Test
    public void test3(){
        String s1 = "abc123";
        byte[] bytes = s1.getBytes();
        System.out.println(Arrays.toString(bytes));

    }

    @Test
    public  void test1(){

        String str1 = "123";
        Integer num = Integer.parseInt(str1);
//        int num = Integer.parseInt(str1);

        System.out.println(num.getClass());

        int num2 = 123456;
        String str2 = String.valueOf(num2);
        //或者
        String str3 = num2 + "";
        System.out.println(str2.getClass());
        System.out.println(str3.getClass());
    }
}
