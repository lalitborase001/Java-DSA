package Lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bankaccount {
    private int balance = 100;
    private final Lock lock = new ReentrantLock();

    public void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + "Attempting to withdraw" + amount);
        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                if (balance >= amount) {
                    try {
                        System.out.println(Thread.currentThread().getName() + "Proceeding with withdraw");
                        Thread.sleep(1000);
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + "Withdrawn amount . Remaining amount" + balance);
                    } catch (Exception e) {

                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + "Insufficient balance");
                }

            } else {
                System.out.println(Thread.currentThread().getName() + " could not acquire the lock, will try later");
            }


        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }


    }
}
