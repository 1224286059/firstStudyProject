package com.atguigu.java;

import org.junit.Test;

import javax.management.OperationsException;
import java.util.ArrayList;
import java.util.List;

/**
 * Author: CodeChen
 * Date: 2023-10-23 11:00
 * Description:
 **/
public class GenericTest1 {

    @Test
    public void test1(){
        //如果定义了泛型类，实例化没有指明类的泛型，则认为该泛型类型为Object类
        Order order = new Order();
        order.setOrderT(13);
        order.setOrderT("你好");
        //实例化泛型类时，建议指明类的泛型
        Order<String> order1 = new Order<>();
        order1.setOrderT("你好");
//        order1.setOrderT(123);//报错，不是String类的
    }

    @Test
    public void test2(){
        SubOrder subOrder = new SubOrder();
        //报错因为子类指定了类的类型为Integer类型
//        subOrder.setOrderT("你好");
        subOrder.setOrderT(132);
    }

    @Test
    public void test3(){
        SubOrder1<String> objectSubOrder1 = new SubOrder1<>();
        objectSubOrder1.setOrderT("你好");
//        objectSubOrder1.setOrderT(123);//报错
    }




    @Test
    public void test5(){
        Order<String> order = new Order<>();
        Integer [] arr = new Integer[]{1,2,3};
        //泛型方法在调用市场，指明参数的类型
        List<Integer> list = order.copyFromArraytToList(arr);
        System.out.println(list);
    }
}
