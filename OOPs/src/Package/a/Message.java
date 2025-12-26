package Package.a;

import Package.b.Greeting;

import static Package.b.Greeting.greeting;

public class Message {
    public static void main(String[] args) {
        System.out.println("Hello worls");
        greeting();
    }
}
