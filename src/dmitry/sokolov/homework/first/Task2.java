package dmitry.sokolov.homework.first;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("index?");
        int needIndex = scanner.nextInt();
        int index = 3;
        int firstDigit = 0;
        int secondDigit = 1;
        int temp = 0;
        int summ = 0;
        while (index <= needIndex - 1) {
            if (secondDigit % 2 == 0) {
                summ += secondDigit;
            }
            temp = secondDigit;
            secondDigit = firstDigit + secondDigit;
            firstDigit = temp;
            index++;
        }
        System.out.println(summ);
    }
}
