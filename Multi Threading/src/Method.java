public class Method extends Thread{
//    public Method(String name) {
//        super(name);
//    }

//    @Override
//    public void run() {
//        System.out.println("Thread is Running...");
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority() + " - count: " + i);
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    System.out.println(e.getMessage());
//
//                }
//            }
//        }
//
//    }

//    public static  void main(String[] args) {
//        Method l = new Method("Low Priority Thread");
//        Method m = new Method("Medium Priority Thread");
//        Method n = new Method("High Priority Thread");
//        l.setPriority(Thread.MIN_PRIORITY);
//        m.setPriority(Thread.NORM_PRIORITY);
//        n.setPriority(Thread.MAX_PRIORITY);
//        l.start();
//        m.start();
//        n.start();
//        n.interrupt();
//    }
//@Override
//public void run() {
//    for (int i = 0; i < 5; i++) {
//        System.out.println(Thread.currentThread().getName() + " is running...");
//        Thread.yield();
//    }
//}
//
//    public static void main(String[] args) {
//        Method t1 = new Method("t1");
//        Method t2 = new Method("t2");
//        t1.start();
//        t2.start();
//    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Hello world! ");
        }
    }

    public static void main(String[] args) {
        Method myThread = new Method();
        myThread.setDaemon(true); // myThread is daemon thread ( like Garbage collector ) now
        Method t1 = new Method();
        t1.start(); // t1 is user thread
        myThread.start();
        System.out.println("Main Done");
    }
}
