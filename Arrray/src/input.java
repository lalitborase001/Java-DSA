import java.lang.reflect.Array;
import java.util.Arrays;

public class input {
    public static void main(String[] args) {
        int[] arr = new  int[4];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 1;
        arr[3] = 1;
        int[] ans = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            ans[i] =arr[i];
        }
        System.out.println("the array is:" + Arrays.toString(ans));

//        int sum = 0;
//        for(int num : arr){
//            sum += num;
//        }
//        System.out.println(sum);
    }
}
