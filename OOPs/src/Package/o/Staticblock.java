package Package.o;

public class Staticblock {
    static int a = 2;
    static int b;

    static{
        System.out.println("Hello");
        b = 5;
    }

    public static void main(String[] args) {
        Staticblock obj = new Staticblock();
        System.out.println(Staticblock.a + " " + Staticblock.b);

        Staticblock.b += 3;
        Staticblock obj2 = new Staticblock();
        System.out.println(Staticblock.a + " " + Staticblock.b);

    }
}
