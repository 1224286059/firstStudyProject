package com.comparestudy;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author XiangChen
 * @create 2023-10-02 15:13
 */
public class Comparetest {

    //Comparable接口

    @Test
    public void test1(){
        String[] arr = new String[]{"AA","BB","GG","FF","RR"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void test2(){
        Goods[] arr = new Goods[4];
        arr[0] = new Goods("LenovoMouse",34);
        arr[1] = new Goods("XiaoMiMouse",45);
        arr[2] = new Goods("HuaWeiMouse",12);
        arr[3] = new Goods("DellMouse",30);

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


    }
}
