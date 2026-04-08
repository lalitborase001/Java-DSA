class MinFlip {
    public static void main(String[] args) {
        int start = 10, goal = 7;
        System.out.println(minBitFlips(start,goal));
    }
    public static int minBitFlips(int start, int goal) {
        int ans = start ^ goal;
        int count = 0;
        while(ans > 0){
            count += (ans & 1);
            ans >>= 1;
        }
        return 1 << count;
    }
}