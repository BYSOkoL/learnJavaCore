package roman.lis.lection15;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

import static roman.lis.lection15.Utils.print;
import static roman.lis.lection15.Utils.sleep;

public class LiveLock {

    public static void liveLockDemo(MyLock first, MyLock second) {
        while (true) {
            tryLock(first, 2000);
            print(first.getName() + " acquired, trying to acquire " + second.getName());
            sleep(2000);
            if (!second.tryLock()) {
                print("Cannot acquire " + second.getName() + " lock, releasing " + first.getName());
                first.unlock();
                continue;
            }

            // never
            break;
        }
        second.unlock();
        first.unlock();
    }

    public static void tryLock(Lock lock, long millis) {
        try {
            lock.tryLock(millis, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        var FIRST = new MyLock("First");
        var SECOND = new MyLock("Second");

        var one = new Thread(() -> liveLockDemo(FIRST, SECOND));
        var second = new Thread(() -> liveLockDemo(SECOND, FIRST));

        one.start();
        second.start();

    }

}
