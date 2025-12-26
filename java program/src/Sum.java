import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        int a = 12;
//        int b = 15;
//        int Sum = a + b;
//
//        System.out.println("the sum is" +Sum);
//        Scanner input = new Scanner(System.in);
//        float num1 = input.nextFloat();
//        float num2 = input.nextFloat();
//
//        float sum = num1 + num2;
//
//        System.out.println("Sum = " + sum);

                Scanner input = new Scanner(System.in);  // Create a Scanner object

                System.out.print("Enter the first number: ");
                float num1 = input.nextFloat();  // Read first float input

                System.out.print("Enter the second number: ");
                float num2 = input.nextFloat();  // Read second float input

                float sum = num1 + num2;  // Calculate the sum

                System.out.println("Sum = " + sum);  // Print the sum



    }
}
