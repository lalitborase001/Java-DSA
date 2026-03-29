class minSub {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int i = 0, j = 0;
        while(j < n){
            sum += nums[j];           
            while(sum >= target){
                int m = j-i+1;
                min = Math.min(min,m);
                sum -= nums[i];
                i++;
            }
            j++;
        }
        if(min == Integer.MAX_VALUE) return 0;
        return min;
    }
}