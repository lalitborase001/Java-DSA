public class multiply {
    public static void main(String[] args) {
        System.out.println(multiply("2","3"));
    }
    public static String multiply(String num1, String num2) {
        int a = Integer.parseInt(num1);
        int b = Integer.parseInt(num2);
        int result = a*b;
        String str = String.valueOf(result);
        return str;
    }
}
