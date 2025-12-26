package Generics;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunction {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 4; i++){
            arr.add(i + 1);
        }
//        arr.forEach((integer -> System.out.println(integer * 2)));

        Consumer<Integer> fun = integer -> System.out.println(integer * 2);
        arr.forEach(fun);

        Operation sum = (a , b) -> (a+b);
        Operation prod = (a, b) -> a * b;
        Operation sub = (a, b) -> a - b;

        LambdaFunction myCalculator = new LambdaFunction();
        System.out.println(myCalculator.operate(5, 3, sum));
        System.out.println(myCalculator.operate(5, 3, prod));
        System.out.println(myCalculator.operate(5, 3, sub));
    }
    private int operate(int a, int b, Operation op) {
        return op.operation(a, b);
    }
}

interface Operation {
    int operation(int a, int b);
}
