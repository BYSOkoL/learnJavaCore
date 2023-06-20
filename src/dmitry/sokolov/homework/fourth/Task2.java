package dmitry.sokolov.homework.fourth;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int count = 0;
        int summ = 0;
        Scanner in = new Scanner(System.in);
        while (true) {
            if (count == 0) {
                System.out.println("Enter first number");
            } else {
                System.out.println("Enter " + (count + 1) + " number.");
            }
            if (in.hasNextInt()) {
                summ += in.nextInt();
                count++;
            }
            if (in.hasNextLine()){
                if (in.nextLine().equalsIgnoreCase("stop") && summ > 0) {
                    System.out.println((double) summ / count);
                    break;
                } else {
                    System.err.println("Enter number or <<stop>>");
                }
            }
        }
    }
}
