package com.atguigu.java2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * Collection接口中生命的方法
 * @author XiangChen
 * @create 2023-10-16 9:59
 */
public class CollectionTest {

    @Test
    public void test1(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Xia",12));
        coll.add(new String("Tom"));
        coll.add(false);
        Person p1 = new Person("Hedf",12);
        coll.add(p1);

        //constains():判断当前集合是都包含obj

        System.out.println(coll.contains(123));
        System.out.println(coll.contains(p1));
        System.out.println(coll.contains(new String("Tom")));//String中equals重写了 --true
        System.out.println(coll.contains(new Person("Xia",12)));//Person中的equals没有重写 --false——>true


        //containsAll(Collection coll1):判断形参colls中所有的元素是否都存在于当前集合中
        Collection colls = Arrays.asList(123,456);
        System.out.println(coll.containsAll(colls));
    }

    @Test
    public void test2(){
        //remove(Object o)
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Xia",12));
        coll.add(new String("Tom"));
        coll.add(false);

//        coll.remove(123);
//        System.out.println(coll);

        coll.remove(new Person("Xia",12));
        System.out.println(coll);

        //removeAll(Collection coll1):从当前集合中移除colls中所有的元素
        Collection coll1  = Arrays.asList(123,4567);
        coll.removeAll(coll1);
        System.out.println(coll);
    }

    @Test
    public void test3(){

        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Xia",12));
        coll.add(new String("Tom"));
        coll.add(false);


        //retainAll(Collection coll1):获取两个集合的交集，返回给当前集合
//        Collection coll1 = Arrays.asList(123,456,789);
//        coll.retainAll(coll1);
//        System.out.println(coll);

        //equals(Object obj):比较两个集合是否完全一样，包括元素的顺序
        Collection coll2 = new ArrayList();
        coll2.add(123);
        coll2.add(456);
        coll2.add(new Person("Xia",12));
        coll2.add(new String("Tom"));
        coll2.add(false);
        System.out.println(coll.equals(coll2));
    }


    @Test
    public void test4(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Xia",12));
        coll.add(new String("Tom"));
        coll.add(false);

        //hashCode():返回当前对象的哈希值
        System.out.println(coll.hashCode());

        //toArray():集合 --->数组
        Object[] arr = coll.toArray();
        for (int i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
        }

        //iterator():返回Iterator接口的实例，用于遍历集合元素，放在Iterator.java中测试

    }
}
