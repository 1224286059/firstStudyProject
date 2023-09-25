package com.java3;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 实现Callable接口 ---JDK5.0新增
 *
 * @author XiangChen
 * @create 2023-09-23 20:12
 *
 * 如何理解实现Callable接口的方式比实现Runnable接口的方式更强大：
 * 1） call()可以有返回值
 * 2）call（）方法可以返回异常
 * 3）Callable是支持泛型的
 */
//1.创建一个实现Callable的实现类
class NumThread implements Callable{
    //2.实现call方法，将此线程需要执行的操作声明在cal()中
    @Override
    public Object call() throws Exception {
        int sum = 0;
        for(int i = 1;i <= 100;i++){
            if(i % 2 == 0){
                System.out.println(i);
                sum += i;
            }
        }
        return sum;
    }
}
public class ThreadNew {
    public static void main(String[] args) {
        //3.创建Callable接口实现类的对象
        NumThread numThread = new NumThread();
        //4.将Callable实现类的对象作为传递到FutureTask构造器中，创建FutureTask的对象
        FutureTask futureTask = new FutureTask(numThread);
        //5.将FutureTask的对象作为参数传递到Thread类的构造器中，创建Thread对象，并调用start()
        new Thread(futureTask).start();
        //获取Callableh中call（）方法中的返回值
        try {
            //get()返回值即为FutureTask构造器参数Callable实现类重写call（）的返回值
            Object sum = futureTask.get();
            System.out.println(sum);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
