class MaxSum {
    public int maxSubarraySum(int[] arr, int k) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int i = 0, j=0;
        while(j < arr.length){
            sum += arr[j];
            if(j-i+1 < k){
                j++;
            }
            else if(j-i+1 == k){
                max = Math.max(max,sum);
                sum = sum - arr[i];
                i++; j++;
            }
        } 
        return max;
    }
}