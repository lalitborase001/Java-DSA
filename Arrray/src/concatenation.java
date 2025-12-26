import java.util.Arrays;

//import java.util.ArrayList;
//import java.util.Arrays;
//
public class concatenation {
//    public static void main(String[] args) {
//        Integer[] arr1 = {1, 2, 3};
//        Integer[] arr2 = {4, 5, 6};
//
//        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr1));
//        list.addAll(Arrays.asList(arr2));
//
//        Integer[] result = list.toArray(new Integer[0]);
//
//        System.out.println("Concatenated array:" +Arrays.toString(result));
//        }
//}
//
       public static void main(String[] args) {
           int[] arr = {1, 2, 3};

           int[] result = new int[arr.length * 2];
           for(int i = 0; i<arr.length; i++){
               result[i] = arr[i];
               result[i + arr.length] = arr[i];
           }
           System.out.println("concatenated array" + Arrays.toString(result));
       }

}
