package com.atguigu.java;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: CodeChen
 * Date: 2023-10-23 10:53
 * Description:
 **/
public class Order<T> {

    String orderName;
    int orderId;

    //内的内容结构可以使用类的泛型
    T orderT;
    public Order(){}

    public Order(String orderName,int orderId,T orderT){
        this.orderName = orderName;
        this.orderId = orderId;
        this.orderT = orderT;
    }

    public T getOrderT() {
        return orderT;
    }

    public void setOrderT(T orderT) {
        this.orderT = orderT;
    }

    public <E> List<E> copyFromArraytToList(E[]arr){
        ArrayList<E> list = new ArrayList<>();
        for(E e :arr){
            list.add(e);
        }
        return list;
    }
}
