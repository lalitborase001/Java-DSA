import java.util.HashMap;



class MaxSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 2, 3, 5, 1, 2, 1, 1};
        int k = 2;
        System.out.println(maxSum(arr,k));
    }

    public int maxSubarraySum(int[] arr, int k) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int i = 0, j=0;
        while(j < arr.length){
            sum += arr[j];
            if(j-i+1 < k){
                j++;
            }
            else if(j-i+1 == k){
                max = Math.max(max,sum);
                sum = sum - arr[i];
                i++; j++;
            }
        } 
        return max;
    }

    public static int maxSum(int[] arr ,int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = arr.length;
        int i = 0,j=0;
        int max = Integer.MIN_VALUE;
        int s = 0;
        while(j < n){
            map.put(arr[j],map.getOrDefault(arr[j],0)+1);
            s += arr[j];
            if (map.size() <= k){
                max = Math.max(s,max);
                j++;
            } while (map.size() > k) {
                map.put(arr[i], map.get(arr[i]) - 1);
                if (map.get(arr[i]) == 0) {
                    map.remove(arr[i]);
                }
                s -= arr[i];
                i++;j++;
            }
        }
        return max;
    }
}