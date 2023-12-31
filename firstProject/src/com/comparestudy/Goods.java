package com.comparestudy;

/**
 * @author XiangChen
 * @create 2023-10-02 15:20
 */
public class Goods implements Comparable{
    private String name;
    private double price;

    public Goods() {
    }

    public Goods(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Goods){
            Goods goods = (Goods) o;
            //方式一：
            if(this.price > goods.price){
                return 1;
            } else if (this.price < goods.price) {
                return -1;
            }else {
                return 0;
            }
            //方法二
//            return Double.compare(this.price,goods.price);
        }
        throw new RuntimeException("传入的数据不一致");

    }
}
