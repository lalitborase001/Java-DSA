class Jump {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        System.out.println(jump(nums));
    }
    public static int jump(int[] nums) {
        return help(0,0,nums);
    }
    public static int help(int index,int jump, int[] nums){
        int n = nums.length;
        if(index >= n-1) return jump;
        int min = Integer.MAX_VALUE;
        for(int i =1;i<= nums[index];i++){
            min = Math.min(min,help(index + i,jump + 1, nums));
        }
        return min;
    }
}