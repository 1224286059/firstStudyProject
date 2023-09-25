package com.java3;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author XiangChen
 * @create 2023-09-23 20:39
 */
class NumberThread implements Runnable{

    @Override
    public void run() {
        for(int i = 1;i <= 100;i++){
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + "-" + i);
            }
        }
    }
}

class NumberThread2 implements Callable{
    @Override
    public Object call() throws Exception {
        int sum = 0;
        for(int i = 1;i <= 100;i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + "-" + i);
                sum += i;
            }
        }
        return sum;
    }
}
public class ThreadPool {
    public static void main(String[] args) {
        //1.提供制定线程数量的线程池
        ExecutorService service = Executors.newFixedThreadPool(10);
        ThreadPoolExecutor sercive1 = (ThreadPoolExecutor)service;//强转
        //设置线程池的属性
//        System.out.println(service.getClass());//能知道对象的类
//        sercive1.setCorePoolSize(15);
//        sercive1.setKeepAliveTime();
        //2.执行指定的线程操作。需要实现接口Runnable或实现Callable接口实现类对象
        NumberThread numThread_1 = new NumberThread();
        service.execute(new NumberThread());//适用于Runnable
        service.submit(new NumberThread2());//适用于Callabe

        service.shutdown();//线程池关闭
    }
}
