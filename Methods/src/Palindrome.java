import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the no:");
        int num = input.nextInt();
        int originalnum = num ;

        int ans = 0;
        while (num > 0){
            int rem = num % 10;
            num /= 10;
            ans = ans * 10 + rem;
        }
        System.out.println(ans);
        if (originalnum == ans){
            System.out.println("the no. is palindrome");
        }else {
            System.out.println("the no. is not palindrome");
        }
    }
}
