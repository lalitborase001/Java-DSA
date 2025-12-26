public class Linearsearch {
    public static int Linearsearch(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == target){
                return i;
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr = {10,20,30,50,70,90};
        int target = 40;
        int result = Linearsearch(arr, target);
        System.out.println("Element found at index "+result);
    }
}
