package Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Reentrantlock {
    private Lock lock = new ReentrantLock();

    public void outermethod(){
        lock.lock();
        try {
            System.out.println("outer method");
            innermethod();
        }finally {
            lock.unlock();
        }

    }

    public void innermethod(){
        lock.lock();
        try {
            System.out.println("inner method");
        }finally {
            lock.unlock();
        }

    }

    public static void main(String[] args) {
        Reentrantlock example = new Reentrantlock();
        example.outermethod();
    }

}
