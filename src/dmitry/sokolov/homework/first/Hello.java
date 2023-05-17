package dmitry.sokolov.homework.first;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        int x = 2;
        int y = 2;
        int z = 3;

        if (x > z) {
            System.out.println(x + y);
        }
        else {
            System.out.println(z);
        }
        double sred = (double) (x+y+z)/3;
        System.out.println(sred);
    }
}
