public class Subset {
    public static void main(String[] args) {
        int[] arr = {8,7,5,4};
        int target = 9;
        int[][] dp = new int[arr.length][target+1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(subsetp(0,arr,target,dp));
    }
    private static boolean subsetp(int i, int[] arr, int target,int[][] dp) {
        if(arr.length == i) {
            if (target == 0) return true;
            else return false;
        }
        if (dp[i][target] != -1) return dp[i][target] == 1;
        boolean ans = false;
        boolean skip = subsetp(i+1,arr,target,dp);
        if (target - arr[i] < 0)  ans = skip;
        else {
            boolean take = subsetp(i + 1, arr, target - arr[i], dp);
            ans = skip || take;
        }
        if (ans) dp[i][target] = 1;
        else dp[i][target] = 0;
        return ans;
    }
}
