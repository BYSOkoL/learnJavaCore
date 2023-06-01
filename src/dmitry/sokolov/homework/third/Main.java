package dmitry.sokolov.homework.third;

import dmitry.sokolov.homework.third.enums.Colors;
import dmitry.sokolov.homework.third.enums.Options;
import dmitry.sokolov.homework.third.enums.WheelSize;
import dmitry.sokolov.homework.third.*;
import dmitry.sokolov.homework.third.service.Service;
import dmitry.sokolov.homework.third.service.ServiceForChangeWheelSize;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(2023,"i8",4.0,Colors.RED,WheelSize.BIG);
        Service service = new Service();
        service.addOptions(Options.ABS);
        service.changeColor(car, Colors.BLACK);

        car.getCarInfo();


    }
}
