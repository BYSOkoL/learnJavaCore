package dmitry.sokolov.homework.third;

import dmitry.sokolov.homework.third.enums.Colors;
import dmitry.sokolov.homework.third.enums.Options;
import dmitry.sokolov.homework.third.enums.WheelSize;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(1992,"i8",4.0,Colors.RED,WheelSize.BIG);
        System.out.println(car);
    }
}
