import java.util.Arrays;

class Robber {
    public static void main(String[] args) {
        int[] nums = {2,3,2};
        System.out.println(rob(nums));
    }
    public static int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        if(n%2 == 0){
            return help(nums,0,dp);
        }
        return help(nums,1,dp);
    }
    static int help(int[] nums ,int n , int[] dp){
        if(n>= nums.length) return 0;
        if(dp[n] != -1) return dp[n] ;
        int take = nums[0] + help(nums, n+2,dp);
        int skip = help(nums, n+1,dp);
        return dp[n] = Math.max(take,skip) ;
    }
}