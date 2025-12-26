import java.util.Arrays;

public class maximumProduct {
    public static void main(String[] args) {
        int[] nums = {3,4,5,2};
        System.out.println(maximumProduct(nums));
    }
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        int ans = 0;
        for (int i = n - 1; i > n - 3; i--) {
            int a = nums[n - 1] - 1;
            int b = nums[n - 2]-1;
//            int c = nums[n - 3];
            ans = a * b ;
        }
        return ans;
    }
}
