class SortBy {
    public int[] sortByBits(int[] arr) {
        int n = arr.length;
        Integer[] nums = new Integer[n];
        for (int i = 0; i < n; i++) {
            nums[i] = arr[i];
        }       
        Arrays.sort(nums, (a, b) -> {
            int bitA = Integer.bitCount(a);
            int bitB = Integer.bitCount(b);
            if (bitA == bitB) {
                return a - b;  
            }
            return bitA - bitB;
        });        
        for (int i = 0; i < n; i++) {
            arr[i] = nums[i];
        }
        return arr;
    }
}