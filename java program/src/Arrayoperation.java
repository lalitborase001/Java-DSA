import java.util.Arrays;

public class Arrayoperation {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 1};
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        int target = 2;
        int result = Arrays.binarySearch(arr, target);

        if (result >= 0)
        {
            System.out.println("Element found at index: " + result);
        }
    }
}
