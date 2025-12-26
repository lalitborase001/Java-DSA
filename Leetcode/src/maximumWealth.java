public class maximumWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,5},{7,3},{3,5}};
        System.out.println(maximumWealth(accounts));
    }
    public static int maximumWealth(int[][] accounts) {
        int Maxsum = 0;
        for (int i = 0; i < accounts.length; i++) {
            int currentsum = 0;
            for (int j = 0; j < accounts[0].length; j++) {
                currentsum = currentsum + accounts[i][j];
            }
            Maxsum = Math.max(Maxsum,currentsum);
        }
        return Maxsum;
    }
}
