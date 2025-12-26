package Lock;

public class Main {
    public static void main(String[] args) {
        Bankaccount hdfc = new Bankaccount();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                hdfc.withdraw(50);
            }
        };
        Thread t1 = new Thread(task, "Thread 1");
        Thread t2 = new Thread(task, "Thread 2");
        t1.start();
        t2.start();
    }
}
