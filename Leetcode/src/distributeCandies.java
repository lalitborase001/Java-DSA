public class distributeCandies {
    public static void main(String[] args) {
        int[] candyType = {1,1,2,2,3,3};
        System.out.println(distributeCandies(candyType));
    }
    public static int distributeCandies(int[] candyType) {
        int n = candyType.length;
        int eat = 1;
        for (int i = 1; i < n ; i++) {
            if (candyType[i] != candyType[i-1]){
                eat++;
            }
        }
        return Math.min(eat,n/2);
    }
}
