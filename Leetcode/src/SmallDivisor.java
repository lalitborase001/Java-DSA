class SmallDivisor {
    static void main() {
        int[] nums = {1,2,5,9};
        int threshold = 6;
        System.out.println(smallestDivisor(nums,threshold));
    }
    public static int smallestDivisor(int[] nums, int threshold) {
        int s = 1;
        int max = nums[0]; 
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i]; 
            }
        }
        int e = max;
        while (s <= e){
            int mid = s + (e-s)/2;
            int total = helper(nums,mid);
            if(threshold < total) s = mid+1;
            else  e = mid -1;
        }
        return s;
    }
    public static int helper(int[] nums , int mid){
        int sum = 0;
        for(int num : nums){
            sum += (num + mid - 1)/mid;
        }
        return sum;
    }
}