import java.util.Arrays;

public class pivotArray {
    public static void main(String[] args) {
        int[] nums = {2,1,4};
        System.out.println(Arrays.toString( pivotArray(nums,2)));
    }
    public static int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] result = new int[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (pivot > nums[i]){
                result[index++] = nums[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (pivot == nums[i]){
                result[index++] = nums[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (pivot < nums[i]){
                result[index++] = nums[i];
            }
        }
        return result;
    }
}
