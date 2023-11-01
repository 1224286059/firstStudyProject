import org.junit.Test;

/**
 * Author: CodeChen
 * Date: 2023-11-01 10:50
 * Description:
 **/
public class IsPalindromeSolution {
    public boolean isPalindromeWay1(int x){
        String s = String.valueOf((new StringBuilder(x + "").reverse()));
        return (x + "").equals(s);
    }

    public boolean isPalindromeWay2(int x){
        //先将负数的排除
        if (x < 0){
            return false;
        }
        if (x < 10){
            return true;
        }
        int div = 1;
        //计算除数的0的个数
        while (x / div >= 10){
            div *= 10;
        }
        while (x > 0){
            int left = x / div;
            int right = x % 10;
            if (left != right)return false;
            x = (x % div) / 10;
            div /= 100;
        }
        return true;
    }

    public boolean isPalindromeWay3(int x){
        if (x < 0 || x % 10 == 0 && x != 0 ) return false;
        int revertedNum = 0;
        while (x > revertedNum){
            revertedNum = revertedNum * 10 + x % 10;
            x /= 10;
        }
        //奇数偶数情况
        return x == revertedNum || x == revertedNum / 10;
    }

    @Test
    public void test(){
        System.out.println(isPalindromeWay1(121));
        System.out.println(isPalindromeWay2(10));
        System.out.println(isPalindromeWay3(11));
    }
}
