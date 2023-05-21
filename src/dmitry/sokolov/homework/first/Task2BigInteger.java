package dmitry.sokolov.homework.first;

import java.math.BigInteger;

public class Task2BigInteger {
    public static void main(String[] args) {
        int index = 3;
        int needIndex = 12;
        BigInteger firstDigit = new BigInteger("0");
        BigInteger secondDigit = new BigInteger("1");
        BigInteger temp = new BigInteger("0");
        BigInteger summ = new BigInteger("0");
        while (index <= needIndex - 1) {
            BigInteger chetnoeProverka = secondDigit.mod(BigInteger.valueOf(2));
            int chetnoeProverkaInt = chetnoeProverka.intValue();
            if (chetnoeProverkaInt == 0) {
                summ = summ.add(secondDigit);
            }
            temp = secondDigit;
            secondDigit = firstDigit.add(secondDigit);
            firstDigit = temp;
            index++;
        }
        System.out.println(summ);
    }
}
