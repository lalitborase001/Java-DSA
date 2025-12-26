public class Comparison {
    public static void main(String[] args) {
        String a = "Lalit";
        String b = "Lalit";
        String c = a;
        //System.out.println(a == b);
        System.out.println(c == a);

        String num1 = new  String("Lalit");
        String num2 = new String("Lalit");
        System.out.println(num1.equals(num2));
    }
}
