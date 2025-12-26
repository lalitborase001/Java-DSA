import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] num = {1,2,3};
        int target = 5;
        int[] result = TwoSum(num, target);
        System.out.println(Arrays.toString(result));
    }
    public static int[] TwoSum(int[] num, int target){
        for (int i = 0; i < num.length; i++){
            for (int j = i+1; j < num.length; j++){
                if (num[i] + num[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
