import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the first number:");
        int num1 = in.nextInt();

        System.out.println("enter the second number:");
        int num2 = in.nextInt();

        if(num1 > num2){
            System.out.println("the num1 is greater:");
        }
        else {
            System.out.println("the num2 is greater:");
        }
    }
}
