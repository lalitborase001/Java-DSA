public class singleNumber136 {
    public static void main(String[] args) {
        int[] nums = {4,2,1,2,1,};
        int ans = singleNumber(nums);
        System.out.println(ans);
    }
    public static int singleNumber(int[] nums) {
        int xor = 0;
        for (int num : nums){
            xor ^= num;
        }
        return xor;
    }
}
