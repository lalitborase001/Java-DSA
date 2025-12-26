import java.util.Arrays;

public class kthFactor {
    public static void main(String[] args) {
        System.out.println(kthFactor(4, 4));
    }
    public static int kthFactor(int n, int k) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0){
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0){
                result[index] = i;
                index++;
            }
        }
        if (result.length >= k){
            return result[k-1];
        }
        return -1;
    }
}
