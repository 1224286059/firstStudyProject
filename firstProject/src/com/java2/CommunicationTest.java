package com.java2;

/**
 * @author XiangChen
 * @create 2023-09-23 18:33
 * 线程通信的例子：使用两个线程打印1-100.线程1和线程2交替打印
 * 说明：
 * 1.wait()、notify()、notifyAll()三个方法必须使用在同步代码块或同步方法中
 * 2.wait()、notify()、notifyAll()三个方法调用者必须是同步代码块或同步方法中的同步监视器
 * 否则会出现异常IllegalMonitorStateException
 * 3.wait()、notify()、notifyAll()三个方法定义在java.lang.Object类中
 *
 * 面试题：sleep（）与wait()方法的异同：
 * 1.相同点：调用两个方法都会使进程出现阻塞
 * 2.不通电：1）两个方法声明位置不一样，Thread类中声明sleep方法，Object类声明wait()方法
 *          2）调用要求不同，sleep可以在任何需要的场景调用，wait方法必须在同步代码块或者同步方法中调用
 *          3）是否释放同步监视器：如果两个方法都使用子啊同步代码块或者同步方法中，sleep（）不会释放同步监视器
 */
class Number implements Runnable{

    private int number = 1;

    @Override
    public void run() {
        while (true){
            synchronized(this){

               notify();

                if(number <=  100){

                    System.out.println(Thread.currentThread().getName() + ":" + number);
                    number++;

                    try {
                        //调用如下方法wait()进入阻塞状态，并且释放锁，与sleep不一样，sleep不释放锁
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }else break;
            }

        }
    }
}

public class CommunicationTest {
    public static void main(String[] args) {
        Number number = new Number();
        Thread t1 = new Thread(number);
        Thread t2 = new Thread(number);
        t1.setName("线程1");
        t2.setName("线程2");
        t1.start();
        t2.start();
    }



}
