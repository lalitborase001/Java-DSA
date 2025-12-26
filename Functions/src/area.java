import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius:");
        double radius = in.nextFloat();

        double area = 3.14 * radius * radius;
        System.out.println("area = " + area);

    }
}
