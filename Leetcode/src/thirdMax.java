public class thirdMax {
    public static void main(String[] args) {
        int[] nums = {3,2,2,1};
        int ans = thirdMax(nums);
        System.out.println(ans);
    }
    public static int thirdMax(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n -1; i++) {
            for (int j = 0; j < n-i-1; j++){
                if (nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        int[] temp = new int[n];
        int uniqueCount = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                temp[uniqueCount++] = nums[i];
            }
        }


        if (uniqueCount >= 3) {
            return temp[uniqueCount - 3];  // 3rd max
        } else {
            return temp[uniqueCount - 1];  // max if less than 3 unique
        }
    }
}
