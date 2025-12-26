import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the base:");
        double base = input.nextFloat();
        System.out.print("enter the height:");
        double height = input.nextFloat();

        double area = 0.5 * base * height;
        System.out.println("area of triangle is :" +area);
    }
}
