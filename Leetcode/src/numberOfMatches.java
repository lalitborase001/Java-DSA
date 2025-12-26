public class numberOfMatches {
    public static void main(String[] args) {
        System.out.println(numberOfMatches(7));
    }
    public static int numberOfMatches(int n) {
//        if(n == 0)
//            return 0;
//        if(n%2 == 0){
//            return n/2 + numberOfMatches(n/2);
//        }else{
//            return (n-1)/2 + numberOfMatches((n-1)/2 + 1);
//        }
        if (n == 1) return 0;

        if (n % 2 == 0) {
            // Even teams: n/2 matches, then recurse with n/2 teams
            return n/2 + numberOfMatches(n/2);
        } else {
            // Odd teams: (n-1)/2 matches, then recurse with (n-1)/2 + 1 teams
            return (n-1)/2 + numberOfMatches((n-1)/2 + 1);
        }
    }

}
