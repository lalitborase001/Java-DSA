public class arrangeCoins {
    public static void main(String[] args) {
        int n = 3;
        int ans = arrangeCoins(n);
        System.out.println(ans);
    }
    public static int arrangeCoins(int n) {
        int level = 0;
        while (n >= level+1 ){
            level ++;
            n -=level;
        }
        return level;

    }
}
