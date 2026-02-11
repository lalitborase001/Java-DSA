import java.util.Arrays;

public class Removal {
    static void main() {
        int[] nums = {1,34,23}; int k = 3;
        System.out.println(minRemoval(nums,k));
    }
    public static int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0;
        int maxLen = 0;

        for (int j = 0; j < nums.length; j++) {
            while ((long) nums[j] > (long) nums[i] * k) {
                i++;
            }
            maxLen = Math.max(maxLen, j - i + 1);
        }

        return nums.length - maxLen;
    }
}