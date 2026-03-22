import java.util.HashMap;

public class Sum {
    public static void main(String[] args) {
        int[] arr = { -1,5};
        int k = 2;
        System.out.println(subArray(arr,k));
    }
    static int subArray(int[] arr,int k){
        int n = arr.length;
        int sum = 0;
        int s = 0;
        int i=0,j=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(j<n){
            map.put(arr[j],map.getOrDefault(arr[j],0)+1);
            if(map.size()<= k) {
                if(arr[j]<0) s +=0;
                else {
                    s = s+arr[j];
                }
                sum = Math.max(sum,s);
                j++;
            }
//            else if (map.size() == k) {
////                for (int m =i;m<j-i+1;m++) {
////                    s = arr[m];
////                }
//                s = s+arr[j];
//                sum = Math.max(sum,s);
//                j++;
//            }
                else if (map.size()>k) {
                while (map.size()>k){
                    map.put(arr[i],map.get(arr[i])-1);
                    if (map.get(arr[i])==0){
                        map.remove(arr[i]);
                    }
                    if (arr[i]<0) s += 0;
                    else {
                        s -= arr[i];
                    }
//                    System.out.println(s);
                    i++;
                }
                if(arr[j]<0) s +=0;
                else {
                    s = s+arr[j];
                }
                sum = Math.max(sum,s);
                j++;
            }
        }
        return sum;
    }
}
