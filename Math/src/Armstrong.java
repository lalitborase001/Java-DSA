public class Armstrong {
    public static void main(String[] args) {
        int n = 153;
        int num = n;
        int sum = 0;
        while(n>0){
            int rem = n % 10;
            n /= 10;
            sum += rem*rem*rem;
        }
        if(sum == num){
            System.out.println("armstrong");
        }else {
            System.out.println("not armstrong");
        }
    }
}
