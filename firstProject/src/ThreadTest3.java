/**
 * @author XiangChen
 * @create 2023-09-23 15:28
 * 演示线程死锁
 * 1.死锁的理解
 * 2.说明：不会抛出异常，不会提示，只是所有线程处于阻塞状态
 * 3.要避免死锁
 */
public class ThreadTest3 {
    public static void main(String[] args) {

        StringBuffer s1 = new StringBuffer();
        StringBuffer s2 = new StringBuffer();


        new Thread(){
            @Override
            public void run() {
                synchronized (s1){
                    s1.append("a");
                    s2.append("1");

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    synchronized (s2){
                        s1.append("b");
                        s2.append("2");
                        System.out.println(s1);
                        System.out.println(s2);
                    }
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {

                synchronized(s2){

                    s1.append("c");
                    s2.append("3");

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    synchronized (s1){

                        s1.append("d");
                        s2.append("4");

                        System.out.println(s1);
                        System.out.println(s2);
                    }
                }
            }
        }.start();


    }

}
