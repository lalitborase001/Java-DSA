package intro;

public class search {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 55, 66, 78};
        int target = 78;
        System.out.println(search(nums, target));
    }
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }
        return -1;
    }

}
