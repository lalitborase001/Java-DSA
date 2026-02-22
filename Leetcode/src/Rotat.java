class Rotat {
    static void main() {
        int[] nums= {1,2,3,4,5,6,7}; int k = 3;
        System.out.println(rotate(nums,k));
    }
    public static int rotate(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        while(count < k){
            int temp = nums[n-1];
            for(int i = n-1;i>0;i--){
                nums[i] = nums[i-1];
            }
            nums[0] = temp;
            count++ ;
        }


        return n;
    }
}