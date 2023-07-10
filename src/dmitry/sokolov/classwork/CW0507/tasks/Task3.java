package dmitry.sokolov.classwork.CW0507.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task3 {
    private static final Random RANDOM = new Random(100);

    public static class Generator extends Thread {
        private List<Integer> list;

        public Generator(List<Integer> list) {
            this.list = list;
        }

        @Override
        public void run() {

            while (true) {
                var number = RANDOM.nextInt(100);
                synchronized (list) {
                    if (list.size() < 100) {
                        list.add(number);
                        if (list.size() == 100) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                try {
                    Thread.sleep(200);
                } catch (InterruptedException ignored) {
                }
            }
        }

                public static void main(String[] args) {
            List<Integer> numberList = new ArrayList<>();
            Generator one = new Generator(numberList);
            Generator two = new Generator(numberList);
            Generator three = new Generator(numberList);
            one.start();
            two.start();
            three.start();

            try {
                one.join();
                two.join();
                three.join();
            } catch (InterruptedException ignored) {
            }

            System.out.println(numberList.size());

        }
    }
}
