import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the no. of elements in array:");
        int n = input.nextInt();

        int[] arr = new int[n];
        System.out.print("enter " +n+ " array: ");
        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }
        int[] ans = new int[n];
        ans[0] = arr[0];
        for(int i = 1; i < n; i++) {
             ans[i] = ans[i-1] + arr[i];
        }
        System.out.print("ans: ");
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}
