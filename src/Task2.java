import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int needIndex = 12;
        int index = 1;
        int firstDigit = 0;
        int secondDigit = 1;
        int temp = 0;
        int summ = 0;
       // System.out.println(0);
        while (index<=needIndex-1) {
            if (secondDigit%2==0){
                summ += secondDigit;
            }
          //  System.out.println(secondDigit);
            temp = secondDigit;
            secondDigit = firstDigit + secondDigit;
            firstDigit = temp;
            index++;
        }
        System.out.println(summ);
    }
}
