import java.util.concurrent.locks.ReentrantLock;

/**
 * @author XiangChen
 * @create 2023-09-23 16:13
 * 解决线程安全问题的方法：Lock锁
 *
 * synchronized方法与lock方法的不同点：
 * （1）lock是手动上锁开锁；synchronized机制是在执行完同步代码后，自动释放监视器
 *
 */
class  Window implements  Runnable{

    private int ticket = 100;
    //1.实例化RenntrantLock
    private ReentrantLock lock = new ReentrantLock();


    @Override
    public void run() {

        while (true){
            try {
                //2.调用lock方法
                lock.lock();
                if(ticket > 0){

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(Thread.currentThread().getName() + ":售票，票号为：" + ticket);
                    ticket --;
                }else break;
            }finally {
                //3.解锁
                lock.unlock();
            }

        }

    }
}

public class LockTest {
    public static void main(String[] args) {
        Window w =new Window();

        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();


    }

}
