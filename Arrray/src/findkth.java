class findkth {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int[] mis = new int[k];
        int index = 0;
        int num = 1;
        int i =0;
        while(index < k){
            if(i<n && arr[i] == num){
                num++; i++;
            }else{
                mis[index] = num;
                num++; index++; 
            }
        }
        return mis[k-1];
    }
}