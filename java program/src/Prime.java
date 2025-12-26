public class Prime {
    public static void main(String[] args) {
        int num = 0;
        boolean isPrime = true;
        if (num <= 1){
            isPrime = false;
        }else {
            for(int i = 2; i < num/2; i++){
                if (num % i == 0){
                    isPrime = false;
                    break;
                }
            }

        }
        if(isPrime){
            System.out.println("Num is prime number");
        }else {
            System.out.println("num is not prime number");
        }


    }
}
