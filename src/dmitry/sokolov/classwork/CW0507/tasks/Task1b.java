package dmitry.sokolov.classwork.CW0507.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task1b {
    public static class Result {
        private int min;
        private int max;
        public int getMin() {
            return min;
        }
        public void setMin(int min) {
            this.min = min;
        }
        public int getMax() {
            return max;
        }
        public void setMax(int max) {
            this.max = max;
        }
    }

    public static void main(String[] args) {
        try {
            var numbers = readNumbers(10);
            var result = new Result();
            var minFinder = new Thread(() -> {
                int min = numbers.get(0);
                for (Integer number : numbers) {
                    if (number < min) {
                        min = number;
                    }
                }
                result.setMin(min);
            });
            var maxFinder = new Thread(() -> {
                int max = numbers.get(0);
                for (Integer number : numbers) {
                    if (number > max) {
                        max = number;
                    }
                }
                result.setMax(max);
            });

            minFinder.start();
            maxFinder.start();

            minFinder.join();
            maxFinder.join();

            System.out.println(result.getMin());
            System.out.println(result.getMax());
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
