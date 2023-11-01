import org.junit.Test;

/**
 * Author: CodeChen
 * Date: 2023-10-28 10:18
 * Description:给定两个大小分别
 * 为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数
 **/
public class FindMedianSortedArrays {
    //归并方法
    public double findWays1(int[] num1 ,int[] num2){
        int m = num1.length;
        int n = num2.length;
        int[] num = new int[m + n];
        //判断两个数组是否有为空的情况
        if (m == 0){
            if (n % 2 ==0){
                return (num2[n / 2 - 1] + num2[n / 2])/2.0;
            }else return num2[n/2];
        }
        if (n ==0){
            if (m % 2 ==0){
                return (num1[m / 2 - 1] + num1[m / 2])/2.0;
            }else return num1[m / 2];
        }
        //两个数组都不为空，归并
        int count = 0;
        int i = 0;
        int j = 0;
        while (count != (m + n)){
            if(i == m){
                while (j != n){
                    num[count++] = num2[j++];
                }
                break;
            }
            if (j == n){
                while (i != m){
                    num[count++] = num1[i++];
                }
                break;
            }

            if(num1[i] < num2[j]){
                num[count++] = num1[i++];
            }else num[count++] = num2[j++];


        }
        if (count % 2 ==0){
            return (num[count/2 - 1] + num[count/2])/2.0;
        }else return num[count / 2];
    }
    @Test
    public void test1(){
        int[] num1 = new int[]{0,2,5};
        int[] num2 = new int[]{3,4};
        System.out.println(findWays1(num1,num2));
    }

}
