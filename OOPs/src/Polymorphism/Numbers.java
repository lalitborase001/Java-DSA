package Polymorphism;

public class Numbers {
    double sum(int a , int b){
        return a+b;
    }
    double sum(double a, int b){
        return a+b;
    }
    double sum(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();
        obj.sum(1, 2 , 3);

    }

}
