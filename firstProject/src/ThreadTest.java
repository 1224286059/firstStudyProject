/**
 * @author XiangChen
 * @create 2023-09-22 10:37
 */
//调用线程的第一种方法：继承并重写run方法，创建对象，然后start（）方法
class  MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }
    @Override
    public void run() {
        for(int i = 0;i < 100;i++){
            if(i % 2 == 0 ){
                System.out.println(Thread.currentThread().getName()+i);
            }
        }
    }
}
public class ThreadTest {
    public static void main(String[] args) {
        MyThread m1 = new MyThread("线程1-");
//        m1.setName("线程1");
        Thread.currentThread().setName("主线程-");
        m1.start();
        for(int j = 1;j < 100;j ++){
            System.out.println(Thread.currentThread().getName()+j);
        }
    }
}

