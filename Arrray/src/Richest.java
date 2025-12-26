import java.util.Scanner;

public class Richest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[3];
        System.out.print("enter the array elements:");
        for(int i = 0; i < arr.length; i++){
            arr[i] = input.nextInt();
        }
        int sum = 0;
        for(int num : arr){
            sum += num;
        }

        System.out.print("enter the array elements:");
        for(int j = 0; j < arr.length; j++){
            arr[j] = input.nextInt();
        }
        int ans = 0;
        for(int num : arr){
            ans += num;
        }
        if (sum > ans){
            System.out.println("the 1st person is rich");
        } else if (sum == ans) {
            System.out.println("both have equal money");

        }else {
            System.out.println("the 2nd person is rich");
        }

    }
}
