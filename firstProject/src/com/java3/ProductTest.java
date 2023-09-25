package com.java3;

/**
 * @author XiangChen
 * @create 2023-09-23 19:10
 *
 *
 * 多线程问题：
 * 1）考虑是否是多线程问题
 * 2）是否共享数据
 * 3）如何解决线程安全问题
 * 4）是否设计线程的通信
 */

class Clerk{

    private int productCount = 0;

    public synchronized void produceProduct() {//生产产品

        if(productCount < 20){
            productCount++;
            System.out.println(Thread.currentThread().getName() + ":开始生产第" + productCount + "个产品");
            notify();
        } else{
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public synchronized void consumeProduct() {//消费产品

        if(productCount > 0){
            System.out.println(Thread.currentThread().getName() + "开始消费第" + productCount + "个产品");
            productCount--;
            notify();
        }else {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Producer extends Thread{//生产者
    private Clerk clerk;

    public Producer(Clerk clerk){
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(getName() + ":开始生产产品");
        while (true){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            clerk.produceProduct();
        }
    }
}


class Consumer extends Thread{//消费者
    private Clerk clerk;

    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(getName() + "开始消费产品");
        while (true){
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            clerk.consumeProduct();
        }
    }
}



public class ProductTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();

        Producer p1 = new Producer(clerk);
        p1.setName("生产者1");
        Consumer c1= new Consumer(clerk);
        c1.setName("消费者1");
        p1.start();
        c1.start();


    }
}
