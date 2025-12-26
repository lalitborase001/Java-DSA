import java.util.Arrays;

import static java.util.Collections.swap;

public class Cyclicsort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2};
        Sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
    static void Sort(int[] arr){
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;

            if (arr[i] != arr[correct]){
            swap(arr , i , correct);
             } else {
                i++;
            }
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
