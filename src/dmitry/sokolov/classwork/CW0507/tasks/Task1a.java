package dmitry.sokolov.classwork.CW0507.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task1a {

    private static class FindMinThread extends Thread {
        private final List<Integer> numbers;
        private int min;
        public FindMinThread(List<Integer> numbers) {
            this.numbers = numbers;
            this.min = numbers.get(0);
        }
        @Override
        public void run() {
            for (Integer number : numbers) {
                if (number < min) {
                    min = number;
                }
            }
        }
        public int getMin() {
            return min;
        }
    }

    private static class FindMaxThread extends Thread {
        private final List<Integer> numbers;
        private int max;
        public FindMaxThread(List<Integer> numbers) {
            this.numbers = numbers;
            this.max = numbers.get(0);
        }
        @Override
        public void run() {
            for (Integer number : numbers) {
                if (number > max) {
                    max = number;
                }
            }
        }
        public int getMax() {
            return max;
        }
    }
    /*
       Пользователь вводит с клавиатуры значение в лист.
       После чего запускаются два потока.
       Первый поток находит максимум в массиве, второй — минимум.
       Результаты вычислений возвращаются в метод main()

       4) запускаем их
       5) печатаем результат.
     */
    public static void main(String[] args) {
        try {
            var numbers = readNumbers(10);
            var minFinder = new FindMinThread(numbers);
            var maxFinder = new FindMaxThread(numbers);

            minFinder.start();
            maxFinder.start();

            minFinder.join();
            maxFinder.join();

            System.out.println(minFinder.getMin());
            System.out.println(maxFinder.getMax());
        } catch (IOException | InterruptedException e) {
            System.err.println("Error. Program ended.");
        }
    }
    public static List<Integer> readNumbers(int n) throws IOException {
        var reader = new BufferedReader(new InputStreamReader(System.in));
        var numbers = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            try {
                numbers.add(Integer.valueOf(reader.readLine()));
            } catch (NumberFormatException e) {
                System.out.println("Write a number!!!");
            }
        }
        return numbers;
    }
}
