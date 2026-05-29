class splitArr {
    public static void main(String[] args) {
        int[] nums = {1,4,4};
        int k = 3;
        System.out.println(splitArray(nums,k));
    }
    public static int splitArray(int[] nums, int k) {

        int s = 0;
        int e = 0;

        for(int num : nums){
            s = Math.max(s, num); // max element
            e += num;             // total sum
        }

        int ans = e;

        while(s <= e){
            int mid = s + (e - s) / 2;

            int parts = 1;
            int sum = 0;

            for(int num : nums){
                if(sum + num > mid){
                    parts++;
                    sum = num;
                }else{
                    sum += num;
                }
            }

            if(parts <= k){
                ans = mid;
                e = mid - 1;
            }else{
                s = mid + 1;
            }
        }

        return ans;
    }
}