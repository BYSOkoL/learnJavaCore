package dmitry.sokolov.classwork.CW1007;

import java.util.LinkedList;

public class ProducerConsumerSingle {
    private static final Integer LIMIT = 10;
    private static final Integer COUNT = 30;
    private static final LinkedList<Integer> BUFFER = new LinkedList<>();

    private static void produce() {
        int value = 0;
        synchronized (BUFFER) {
            while (true) {
                while (BUFFER.size() == LIMIT) {
                    try {
                        BUFFER.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}
