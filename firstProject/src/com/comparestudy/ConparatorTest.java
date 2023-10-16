package com.comparestudy;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author XiangChen
 * @create 2023-10-02 15:36
 */
public class ConparatorTest {
    @Test
    public void test(){
        String[] arr = new String[]{"AA","BB","GG","FF","RR"};
        Arrays.sort(arr,new Comparator() {
            //按照字符串从大到小排序
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof String && o2 instanceof String){
                    String s1 = (String) o1;
                    String s2 = (String) o2;
                    return -s1.compareTo(s2);
                }
                return 0;
//                throw new RuntimeException("输入的数据类型不一致");
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}
