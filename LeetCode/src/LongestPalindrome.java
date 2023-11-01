import org.junit.Test;

/**
 * Author: CodeChen
 * Date: 2023-10-28 11:29
 * Description:给你一个字符串 s，找到 s 中最长的回文子串。
 * 如果字符串的反序与原始字符串相同，则该字符串称为回文字符串。
 **/
public class LongestPalindrome {
    public String longestPalindromeWays1(String s){
        //采用暴力法
        int len = s.length();
        //当只有一个字符时，直接返回s
        if (len < 2){
            return s;
        }
        //后续只用记录s的开始位置以及长度
        int maxlen = 1;
        int begin = 0;
        char[] chars = s.toCharArray();
        for (int i = 0;i < len - 1;i++){
            for (int j = i + 1;j < len;j++){
                if (j - i + 1 > maxlen && valuePalindromic(chars,i,j)){
                    maxlen = j- i +1;
                    begin = i;
                }
            }
        }return s.substring(begin,begin + maxlen);
    }

    private boolean valuePalindromic(char[] chars,int left,int right) {
        while (left < right){
            if (chars[left] != chars[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public String longestPalindromeWays2(String s){
        //采用动态规划方法
        int len = s.length();
        if (len < 2 ){
            return s;
        }
        int maxlen = 1;
        int begin = 0;

        //dp[i,j]表示s[i,j]是回文串
        boolean[][] dp = new boolean[len][len];
        char[] chars = s.toCharArray();
        //首先对于dp进行初始化
        for (int i = 0;i < len;i++){
            dp[i][i] = true;
        }
        //然后进行遍历
        for (int j = 1;j < len;j++){
            for (int i = 0;i < j;i++){
                if (chars[i] != chars[j]){
                    dp[i][j] = false;
                }else {
                    if (j - i < 3){
                        dp[i][j] = true;
                    }else dp[i][j] = dp[i + 1][j - 1];
                }

                if (dp[i][j] && j - i +1 >maxlen){
                    begin = i;
                    maxlen = j - i +1;
                }
            }
        }
        return s.substring(begin,begin + maxlen);
    }


    @Test
    public void test(){
        System.out.println(longestPalindromeWays1("abccba"));
        System.out.println(longestPalindromeWays1("asd"));
        System.out.println(longestPalindromeWays2("abccba"));
        System.out.println(longestPalindromeWays2("asd"));
    }
}
