import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class getConcatenation {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        int[] ans =  getConcatenation(nums);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] getConcatenation(int[] nums) {
        int[] result = new int[2 * nums.length];
        for (int i = 0; i <= nums.length - 1; i++) {
            result[i] = nums[i];
            result[i+ nums.length] = nums[i];
        }
        return result;
    }
}
