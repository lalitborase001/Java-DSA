class minCost {
    static void main() {
        int[] nums =  {1,2,3,12};
        System.out.println(minimumCost(nums));
    }
    public static int minimumCost(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int mini = nums[0]+nums[i] + nums[j];
                min = Math.min(min,mini);
            }
        }
        return min;
    }
}