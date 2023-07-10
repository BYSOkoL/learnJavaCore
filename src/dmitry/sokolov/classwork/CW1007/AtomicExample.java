package dmitry.sokolov.classwork.CW1007;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicExample {
    private final AtomicInteger counter = new AtomicInteger();
    public void increment () {
        this.counter.incrementAndGet();
    }
    public int getCounter() {
        return counter.get();
    }

    public static void main(String[] args) {
        AtomicExample atomicExample = new AtomicExample();
        Runnable task = () -> {
            for (int i = 0; i < 100; i++) {
                atomicExample.increment();
            }
        };
        Thread first = new Thread(task);
        Thread second = new Thread(task);
        first.start();
        second.start();
        try {
            first.join();
            second.join();
        } catch (InterruptedException ignored) {}
        System.out.println(atomicExample.getCounter());

    }
}
