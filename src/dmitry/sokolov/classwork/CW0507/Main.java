package dmitry.sokolov.classwork.CW0507;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static class FindMinThread extends Thread {
        private final List<Integer> numbers;

        @Override
        public void run() {
          var min = numbers.get(0);
        }
    }
    private static class FindMaxThread extends Thread {

    }
    public static void main(String[] args) {
        try {
            var numbers = readNumbers(10);
        } catch (IOException e) {
            System.out.println("Error. Program ended");
        }
    }

    public static List<Integer> readNumbers(int n) throws IOException {
        var reader = new BufferedReader(new InputStreamReader(System.in));
        var numbers = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            String data = reader.readLine();
            try {
                numbers.add(Integer.valueOf(data));
            } catch (NumberFormatException e) {
                System.out.println("Write a number");
            }
        }
        return numbers;
    }
}
