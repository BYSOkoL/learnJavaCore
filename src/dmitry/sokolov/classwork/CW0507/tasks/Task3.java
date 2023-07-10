package dmitry.sokolov.classwork.CW0507.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task3 {

    public static class Generator extends Thread {
        private List<Integer> list;

        public Generator(List<Integer> list) {
            this.list = list;
        }

        @Override
        public void run() {
            Random random = new Random();
            for (int i = 0; i < 100; i++) {
                int randomNumber = random.nextInt();
                list.add(randomNumber);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public static void main(String[] args) {
            List<Integer> numberList = new ArrayList<>();
            Generator generator = new Generator(numberList);
            generator.start();

            try {
                generator.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Сгенерированные числа:");
            for (int number : numberList) {
                System.out.println(number);
            }
        }
    }
}
