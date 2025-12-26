public class isUgly {
    public static void main(String[] args) {
        System.out.println(isUgly(6));
    }
    public static boolean isUgly(int n) {
        if (n <= 0){
            return false;
        }
        int[] prime = {2,3,5};
        for (int p : prime){
            while (n % p == 0){
                n /= p;  // keep dividing if divisible
            }
        }
        return n == 1;
    }
}
