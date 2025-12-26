import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the no.:");
        int n = in.nextInt();

        int a = 0;
        int b = 1;
        int count = 2;

        while (count <= n) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println("The Fibonacci number at position " + n + " is: " + b);

    }
}
//            Scanner in = new Scanner(System.in);
//            System.out.print("Enter the position (n) of the Fibonacci series: ");
//            int n = in.nextInt();
//
//            if (n <= 0) {
//                System.out.println("Please enter a positive integer.");
//                return;
//            }
//
//            int a = 0;
//            int b = 1;
//
//            if (n == 1) {
//                System.out.println("The Fibonacci number at position " + n + " is: " + a);
//                return;
//            }
//
//            int count = 2;
//
//            while (count <= n) {
//                int temp = b;
//                b = b + a;
//                a = temp;
//                count++;
//            }
//
//            System.out.println("The Fibonacci number at position " + n + " is: " + b);
//        }
//    }