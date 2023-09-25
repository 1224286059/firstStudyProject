/**
 * @author XiangChen
 * @create 2023-09-22 11:25
 */

class MyThead2 implements Runnable{

    @Override
    public void run() {
        for(int i = 0;i < 100;i++){
            if(i %2 ==0){
                System.out.println(i);
            }
        }
    }
}
public class ThreaTest2 {
    public static void main(String[] args) {
        MyThead2 m2 = new MyThead2();
        Thread t2 = new Thread(m2);
        t2.start();
    }


}
