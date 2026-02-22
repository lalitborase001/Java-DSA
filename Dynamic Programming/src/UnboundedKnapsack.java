public class UnboundedKnapsack {
    public static int profit(int i,int[] val,int[] wt,int C,int[][] dp){
        if (i == wt.length) return 0;
        if (dp[C][i] != -1) return dp[C][i];
        int skip = profit(i+1,val,wt,C,dp);
        if (wt[i] > C) return dp[C][i] = skip;
        int take = val[i] + profit(i,val,wt,C-wt[i],dp );
        return dp[C][i] = Math.max(skip,take);
    }
    public static void main(String[] args) {
        int[] val = {5,3,7,16};
        int[] wt = {1,2,8,10};
        int C = 8;
        int n = wt.length;
        int[][] dp = new int[C+1][n];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(profit(0,val,wt,C,dp));
    }
}
