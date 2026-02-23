class findTarget {
    static void main() {
        int[] nums = {1,1,1,1,1}; int target = 3;
        System.out.println(findTargetSumWays(nums,target));
    }
    public static int findTargetSumWays(int[] nums, int target) {
        return ways(0,nums,target);
    }
    public static int ways(int i,int[] nums,int target){
        if(i==nums.length){
            if(target == 0) return 1;
            else return 0;
        }
        int add = ways(i+1,nums,target-nums[i]);
        int sub = ways(i+1,nums,target+nums[i]);
        return add + sub;
    }
}