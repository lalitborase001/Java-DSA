import java.util.Scanner;

public class LCF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number1:");
        int num1 = input.nextInt();

        System.out.print("enter the number2:");
        int num2 = input.nextInt();

        System.out.print("The LCM of " +num1+ "and" +num2+ "is:");

        for (int i = 1; i <= Math.max(num1, num2); i++) {
            if (num1 % i == 0 && num2 % i ==0) {
                System.out.print(i + " ");
            }

        }
    }
}
