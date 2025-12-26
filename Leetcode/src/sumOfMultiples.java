public class sumOfMultiples {
    public static void main(String[] args) {
        System.out.println(sumOfMultiples(15));
    }
    public static int sumOfMultiples(int n) {
        int sum = 0;
        for(int i = 0;i <= n; i++){
            if(i%3 == 0 || i%5 == 0 || i%7 == 0){
                sum += i;
            }
        }
        return sum;
    }
}
