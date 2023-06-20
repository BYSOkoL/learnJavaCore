package dmitry.sokolov.homework.fourth;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        int number;
        String string;
        System.out.println("Введите число: ");
        while (true) {
            if (in.hasNextInt()) {
                number = in.nextInt();
                System.out.println("Введите число: ");
                numbers.add(number);
                continue;
            }
            if (in.hasNextLine()) {
                string = in.nextLine();
                if (string.equalsIgnoreCase("status")) {
                    Collections.sort(numbers);
                    System.out.println("Отсортированный массив:" + numbers);
                    continue;
                }
                if (string.equalsIgnoreCase("stop")) {
                    break;
                } else {
                    System.err.println("Enter number, <<status>> or <<stop>>");
                }
            }
        }
    }
}