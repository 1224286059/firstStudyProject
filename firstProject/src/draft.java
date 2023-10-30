import org.junit.Test;

/**
 * @author XiangChen
 * @create 2023-10-30 18:37
 */
public class draft {
    public int reverse(int x) {
        int res = 0;
        while (x != 0){
            //获取最后的以为数字
            int tmp = x % 10;
            if (res > 214748364 || (res == 214748364)&& tmp > 7){
                return 0;
            }
            if (res < -214748364 ||(res == -214748364)&& tmp < 8){
                return 0;
            }
            res = res*10 +tmp;
            x /= 10 ;

        }
        return res;
    }
    @Test
    public void test(){
        System.out.println(Math.pow(2,31));
    }
}
