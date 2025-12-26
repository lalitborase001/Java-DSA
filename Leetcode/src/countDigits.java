public class countDigits {
    public static void main(String[] args) {
        System.out.println(countDigits(1248));
    }
    public static int countDigits(int num) {
        int ans = 0;
        int original = num;
        while(num > 0){
            int val = num % 10;
            if(original % val == 0){
                ans++;
            }
            num /= 10;
        }
        return ans;
    }
}
