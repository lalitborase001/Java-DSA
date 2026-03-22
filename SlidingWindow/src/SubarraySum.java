class SubarraySum {
    public static void main(String[] args) {
        int[] arr = {1}; int k =0;
        System.out.println(subarraySum(arr,k));
    }
    public static int subarraySum(int[] arr, int k) {
        int n = arr.length;
        int count = 0;
        int sum = 0;
        int i = 0, j = 0;
        while (j < n) {
            sum += arr[j];
            while (sum > k) {
                sum -= arr[i];
                i++;
            }
            if (sum == k) {
                count++;
            }
            j++;
        }
        return count;
    }
}