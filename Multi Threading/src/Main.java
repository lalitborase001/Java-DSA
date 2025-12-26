//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Test world = new Test();
        Thread t1 = new Thread(world);
        t1.start();
        for (;;) {
            System.out.println("Hello ");
        }
//        world.start();
//        System.out.println(Thread.currentThread());

    }
}