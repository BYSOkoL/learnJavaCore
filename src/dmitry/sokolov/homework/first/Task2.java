package dmitry.sokolov.homework.first;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("index?");
        int needIndex = scanner.nextInt();

        int index = 1;
        int firstDigit = 0;
        int secondDigit = 1;
        int c = 0;
        int summ = 0;
        while (index <= needIndex - 1) {
            if (secondDigit % 2 == 0) {
                summ += secondDigit;
            }
            c = secondDigit;
            secondDigit = firstDigit + secondDigit;
            firstDigit = c;
            index++;

        }
        System.out.println(summ);


    }
}
