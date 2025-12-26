
public class Exceptionhandling {
    public static void main(String[] args) {
        int num = 10;
        int deno = 0;
        try {
            int result = num / deno;
            System.out.println(result);
        }
        catch (ArithmeticException e){
            System.out.println("Error: Division by zero is not allowed");
        }
        catch (Exception e){
            System.out.println("An unexpected error occured" + e.getMessage());
        }
        finally {
            System.out.println("Exceution Completed");
        }
    }
}
