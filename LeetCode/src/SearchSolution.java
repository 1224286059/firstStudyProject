import com.sun.xml.internal.ws.runtime.config.TubelineFeatureReader;
import org.junit.Test;

/**
 * Author: CodeChen
 * Date: 2023-11-02 22:57
 * Description:实现对数组的查找，二分查找
 **/
public class SearchSolution {
    public int search(int[] nums,int target){
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right){
            int mid  = left + (right - left) / 2;
            if (nums[mid] == target){
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            }else if (nums[mid] > target){
                right = mid - 1;
            }
        }
        return -1;
    }

    @Test
    public void test(){
        int[] nums = new int[] {3};
        int target = 3;
        System.out.println(search(nums,target));
    }
}
