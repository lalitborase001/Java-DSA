public class isPalindrome {
    public static void main(String[] args) {
        int x = 121;
        boolean ans = isPalindrome(x);
        System.out.println(ans);
    }
    public static boolean isPalindrome(int x) {
        int original = x;
        int ans = 0;
        while (x > 0){
            int rem = x % 10;
            ans = ans * 10 + rem;
            x /= 10;
        }
        return original == ans;
    }
}