import java.util.Arrays;

public class searchRange {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] result = searchRange(nums,target);
        System.out.println(Arrays.toString(result));
    }
    public static int[] searchRange(int[] nums , int target){
        int[] result = {-1,-1};
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == target){
                result[0] = i;
                break;
            }
        } if (result[0] == -1) {
            return result;
        }
        for (int i = nums.length - 1; i >= 0; i--){
            if (nums[i] == target){
                result[1] = i;
                break;
            }
        }
        return result;
    }
}
