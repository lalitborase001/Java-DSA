import java.util.HashMap;

class countSubarray {
    public static void main(String[] args) {
        int[] nums = {1,1,2,1,1}; int k = 3;
        System.out.println(numberOfSubarrays(nums,k));
    }
    public static int numberOfSubarrays(int[] nums, int k) {
        int count = 0;
        int i =0; int j = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(j<nums.length){
            if(nums[j] % 2 != 0){
                map.put(nums[j], map.getOrDefault(nums[j],0)+1);
            }
            if(map.size() < k){
                j++;
            }
            else if(map.size() == k){
                count += 1;
                i++;j++;
            }else{
                if(nums[i] % 2 != 0){
                    map.put(nums[j], map.getOrDefault(nums[j],0)-1);
                }
                i++;
            }
        }
        return count;
    }
}