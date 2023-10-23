package com.atguigu.java;

import org.junit.Test;

import java.util.*;

/**
 * Author: CodeChen
 * Date: 2023-10-21 16:30
 * Description:
 **/
public class GenericTest {

    @Test
    public void test1(){

        ArrayList<Integer> list= new ArrayList<>();

        list.add(121);
        list.add(23);
        //编译的时候就会对类型进行检查
//        list.add("asd");
        //方式一
//        for (Integer i :list){
//            int sore = i;
//            System.out.println(sore);
//        }
        //方式二
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test3(){
        Map<String, Integer> map = new HashMap<>();
        map.put("xc",12);
        map.put("xsad",123);
//        map.put(12,23);
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().getKey() + "-" + iterator.next().getValue());
        }
    }
}
