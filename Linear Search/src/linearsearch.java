

public class linearsearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return index of the found element
            }
        }
        for (int i = arr.length -1; i >= 0; i--){
            if (arr[i] == target){
                return i;
            }
        }
        return -1; // Return -1 if element is not found
    }
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 14, 28};
        int target = 14;
        int result = linearSearch(arr, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }

    }
}