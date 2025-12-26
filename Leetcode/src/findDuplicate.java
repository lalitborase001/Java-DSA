import java.util.Arrays;

class findDuplicate {
    public static void main(String[] args) {
        int[] arr = {8,7,3,5,3,6,1,4};
        int[] result = findDuplicate(arr);
        System.out.println(Arrays.toString(result));
    }
    public static int[] findDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {

            if (arr[i] != i + 1) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i , correct);
                } else {
                    return new int[] {arr[i], i+1};
                }
            } else {
                i++;
            }
        }
        return new int[] {-1,-1};
//        int i = 0;
//        while (i < arr.length){
//            int correct = arr[i] - 1;
//            if (arr[i] < arr.length && arr[i] != arr[correct]){
//                swap(arr,i,correct);
//            }else {
//                i++;
//            }
//        }
//        for(int index = 0; index<arr.length;index++){
//            if(arr[index] != index + 1){
//                return index + 1;
//            }
//        }
//        return arr[arr.length-1];
    }
    static void swap(int[] arr, int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}