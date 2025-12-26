import java.util.Arrays;
import java.util.Scanner;

public class input{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the no. of element:");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.print("enter the array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("the array is:" + Arrays.toString(arr));

    }
}
