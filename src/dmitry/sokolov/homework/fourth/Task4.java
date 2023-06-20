package dmitry.sokolov.homework.fourth;

import java.util.Scanner;

public class Task4 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int firstNumber = getNumber();
        int secondNumber = getNumber();
        char operation = getChar();
        int result = calc(firstNumber, secondNumber, operation);
        System.out.println("Result: " + result);
    }

    public static int getNumber() {
        System.out.println("Enter number:");
        int number;
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
        } else {
            System.err.println("Error with entered number, try again: ");
            scanner.next();
            number = getNumber();
        }
        return number;
    }

    public static char getChar() {
        System.out.println("Введите операцию (+, -, *, /):");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Допущена ошибка при вводе операции. Введите еще раз (+, -, *, /).");
            scanner.next();
            operation = getChar();
        }
        return operation;
    }

    public static int calc(int firstNumber, int secondNumber, char operation) {
        int result;
        switch (operation) {
            case '+' -> result = firstNumber + secondNumber;
            case '-' -> result = firstNumber - secondNumber;
            case '*' -> result = firstNumber * secondNumber;
            case '/' -> result = firstNumber / secondNumber;
            default -> {
                System.out.println("Повторите ввод.");
                result = calc(firstNumber, secondNumber, getChar());
            }
        }
        return result;
    }
}
