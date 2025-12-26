package Package.o;

import Package.b.Greeting;

public class Main {
    public static void main(String[] args) {
        Human lalit = new Human(14, 20, "Lalit",false );
        Human lucky = new Human(19, 200, "Lucky",true );
        System.out.println(lucky.married);
        System.out.println(Human.population);
        fun();

    }
    static void fun(){
        Main obj = new Main();
        obj.Greeting();
    }
    void Greeting(){
        System.out.println("Hello ");
    }
}
