class Consecutive {
    static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for(int ele : nums){
            if(ele == 1){
                count++;
                max = Math.max(count,max);
            }
            else count = 0;
        }
        return max;
    }
}