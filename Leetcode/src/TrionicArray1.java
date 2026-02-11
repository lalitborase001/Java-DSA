class TrionicArray1 {
    static void main() {
        int[] nums = {1,2,3};
        System.out.println(isTrionic(nums));
    }
    public static boolean isTrionic(int[] nums) {
        int s = 0;
        int n = nums.length;
        int mid = (n-s)/2;
        for(int p = 0;p<mid;p++){
            for(int q = n-1;q>mid;q--){
                if(nums[p] < nums[p+1]){
                    return true;
                }
                if(nums[q] < nums[q-1]){
                    return true;
                }
                if(nums[q] < nums[n-1]){
                    return true;
                }
            }
        }
        return false;
    }
}