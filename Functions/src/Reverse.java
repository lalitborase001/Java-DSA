import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a string:");
        String str = input.next();

         String reversed = "" ;

         for (int i = str.length() - 1; i >= 0; i--){
             reversed += str.charAt(i);
         }
        System.out.println("Reverse String: " +reversed);



    }
}
