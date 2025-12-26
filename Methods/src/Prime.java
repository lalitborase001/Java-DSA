import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        // Checking if the number is prime
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }


    }

    // Method to check if a number is prime
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;  // Numbers 0 and 1 are not prime
        }
        for (int i = 2; i < n; i++) {  // Check divisibility up to sqrt(n)
            if (n % i == 0) {
                return false;  // If divisible, not a prime number
            }
        }
        return true;
    }
}
