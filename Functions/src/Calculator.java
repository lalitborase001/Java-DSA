public class Calculator {
    public static int calculate(int a, int b){
        return a+b;
    }
    public static int calculate (int a, int b, int c){
        return a*b*c;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int sum = calculate(10 , 20);
        System.out.println(sum);
        int product = calculate(10, 20 , 30);
        System.out.println(product);
    }
}
