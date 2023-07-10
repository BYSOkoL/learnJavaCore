package roman.lis.lection15;

import static roman.lis.lection15.Utils.print;
import static roman.lis.lection15.Utils.sleep;

public class DeadLock {

    private static void deadLockDemo(MyLock first, MyLock second) {
        print("Inside method. Before synchronized block");
        synchronized (first) {
            print("Get lock " + first.getName());
            sleep(1000);
            print("Try to get lock " + second.getName());
            synchronized (second) {
                print("NEVER");
            }
        }
    }

    public static void main(String[] args) {
        var FIRST = new MyLock("First");
        var SECOND = new MyLock("Second");

        var one = new Thread(() -> deadLockDemo(FIRST, SECOND));
        var second = new Thread(() -> deadLockDemo(SECOND, FIRST));

        one.start();
        second.start();
    }

}
