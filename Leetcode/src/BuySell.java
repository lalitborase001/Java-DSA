class BuySell {
    static void main() {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }

//    public int maxProfit(int[] arr) {
//        int n = arr.length;
//        int max = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n && i < j; j++) {
//                if (arr[j] - arr[i] > 0) {
//                    int sum = arr[j] - arr[i];
//                    max = Math.max(max, sum);
//                }
//            }
//        }
//        return max;
//    }
    public static int maxProfit(int[] arr) {
        int n = arr.length;
        int max = 0;
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            min =  Math.min(min, arr[i]);
            int sub = arr[i] - Math.min(min, arr[i]);
            max = Math.max(max,sub);
        }
        return max;
    }

}