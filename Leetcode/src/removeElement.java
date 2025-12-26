public class removeElement {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        System.out.println(removeElement(nums,3));
    }
    public static int removeElement(int[] nums, int val) {
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val){
                nums[n] = nums[i];
                n++;
            }
        }
        return n;
//        int num = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (i == val){
//                ;
//            }else {
//                num++;
//            }
//        }
//        return int[] num;
    }
}
