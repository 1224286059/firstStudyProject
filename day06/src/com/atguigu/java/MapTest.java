package com.atguigu.java;

import org.junit.Test;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * Author: CodeChen
 * Date: 2023-10-18 15:13
 * Description:
 * --Map:双列数据，存储key-value对的数据，类似于y=f（x）
 *      key所在的类需要重写equals()和hashCode()方法（） -->使用的Set对key进行的存储
 *      value所在的类要重写equals()方法 -->使用的Collection对value进行的存储
 *      --HashMap:作为Map的主要实现类,线程不安全，效率高,存储null的key和value
 *          --LinkedHashMap:保证在遍历map元素时，可以按照添加的顺序实现遍历
 *                          原因：在原有的HashMap镀层结构基础上，添加了一对指针，指向前一个后一个元素
 *                          对于频繁的遍历操作，此操作执行效率高于HashMap
 *      --TreeMap:保证按照添加的key-value对进行排序，实现排序遍历，此时考虑key的自然排序或定制排序
 *                  底层使用的诗红黑树
 *      --Hashtable:作为顾老师的实现类，线程安全，效率低，不能存储null的key和value
 *          --Properties：常用来处理配置文件，key和value都是String类型
 *
 *
 *         HashMap的底层：数组+链表（jdk7及以前）
 *                      数组+链表+红黑树（jdk8）
 *
 * 面试题：
 * 1.HashMap的底层实现原理
 *
 * 2.HashMap和Hashtable的异同
 * 3.CurrentHashMap与Hashtable的区别（暂时不讲 ）
 **/
public class MapTest {

    @Test
    public void test1(){
        HashMap hashMap = new HashMap();
//        Hashtable hashtable = new Hashtable();
        hashMap.put(null,null);
//        hashtable.put(null,null);

    }
}
