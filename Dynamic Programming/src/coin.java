class Solution {
    public long coinCount(int i,int[] coins,int amount,long[][] dp){
        if(i == coins.length) {
            if(amount == 0)   return 0;
            else return Integer.MAX_VALUE;
        }
        if (dp[i][amount] != -1) return dp[i][amount];    
        long skip = coinCount(i+1,coins,amount,dp);
        if(amount - coins[i] <0) return dp[i][amount] = skip;
        long pick = 1+ coinCount(i,coins,amount-coins[i],dp);
        return dp[i][amount] = Math.min(skip,pick);
    }
//    public int coinChange(int[] coins, int amount) {
//        long[][] dp = new long[coins.length][amount+1];
//        for (int i = 0; i < dp.length; i++) {
//            for (int j = 0; j < dp[0].length; j++) {
//                dp[i][j] = -1;
//            }
//        }
//        int ans = (int)coinCount(0,coins,amount,dp);
//        if(ans == Integer.MAX_VALUE) return -1;
//        return ans;
    }
    // Space Optimization

    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        long[][] dp = new long[2][amount+1];
        for (int i = 0; i < amount+1; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                long skip = (i>0) ? dp[0][j] : ((j==0) ? 0 : Integer.MAX_VALUE);
                if(j - coins[i] <0)  dp[1][j] = skip;
                else{
                    long pick = 1+ dp[1][j-coins[i]] ;
                    dp[1][j] = Math.min(skip,pick);
                }
            }
            for (int j = 0; j < amount+1; j++) {
                dp[0][j] = dp[1][j];
            }
        }
        int ans = (int)dp[n-1][amount];
        if(ans == Integer.MAX_VALUE) return -1;
        return ans;
    }
}