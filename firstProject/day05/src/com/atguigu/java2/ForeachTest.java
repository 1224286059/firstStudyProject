package com.atguigu.java2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author XiangChen
 * @create 2023-10-16 16:09
 */
public class ForeachTest {

    @Test
    public void test1(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Xia",12));
        coll.add(new String("Tom"));
        coll.add(false);

        //for(集合/数组元素类型 局部变量：集合/数组)；内部仍然调用迭代器
        for(Object object : coll){
            System.out.println(object);
        }
    }

    @Test
    public void test2(){
        int[] arr = new int[]{1,2,3,4};
        for(int i :arr){
            System.out.println(i);
        }
    }

    @Test
    public void test3(){

        String[] arr = new String[]{"MM","MM","MM"};

        //方式一：普通的for循环
//        for (int i = 0;i < arr.length;i++){
//            arr[i] = "GG";
//        }
        //方式二：增强for循环
        for(String s:arr){
            s = "GG";
        }
        for(String s:arr){
            System.out.println(s);
        }

    }
}
