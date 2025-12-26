import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the num1: ");
        float num1 = input.nextFloat();

        System.out.println("enter the num2: ");
        float num2 = input.nextFloat();

        float product = num1 * num2;
        System.out.println("the product is : " +product);
    }
}
