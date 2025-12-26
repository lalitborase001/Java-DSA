public class majorityElement169 {
    public static void main(String[] args) {
        int[] nums = {3,2,3,2,2};
        int ans = majorityElement(nums);
        System.out.println(ans);
    }
    public static  int majorityElement(int[] nums) {
         int count = 0;
         int candidate = 0;
         for (int num : nums){
             if (count == 0){
                 candidate = num;
             }
             if (num == candidate){
                 count ++;
             }else {
                 count --;
             }
         }
         return candidate;
    }

}
