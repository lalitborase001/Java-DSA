public class Mountain {
    public static void main(String[] args) {
        int[] arr = {0, 2, 3, 4, 5, 2, 1, 0};
        Mountain m = new Mountain();
        System.out.println(m.peakIndexInMountainArray(arr));
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int s =0;
        int e = arr.length -1;

        while (s < e){
            int mid = s + (e-s)/2;
            if (arr[mid] <= arr[mid + 1]){
                s = mid + 1;
            }else {
                e = mid ;
            }
        }
        return s;
    }
}
