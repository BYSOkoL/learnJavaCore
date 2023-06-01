package dmitry.sokolov.homework.third;

import dmitry.sokolov.homework.third.enums.Colors;
import dmitry.sokolov.homework.third.enums.Options;
import dmitry.sokolov.homework.third.enums.WheelSize;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(2023,"BMW i8",4.0,Colors.RED,WheelSize.BIG);
        car.addOptions(Options.ESP);
        car.addOptions(Options.ABS);
        car.addOptions(Options.PDC);

        car.deleteOptions(Options.PDC);
        car.getCarInfo();
    }
}
