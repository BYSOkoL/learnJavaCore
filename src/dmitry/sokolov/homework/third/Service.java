package dmitry.sokolov.homework.third;

import dmitry.sokolov.homework.third.Car;
import dmitry.sokolov.homework.third.enums.Colors;
import dmitry.sokolov.homework.third.enums.Options;
import dmitry.sokolov.homework.third.enums.WheelSize;

public class Service {
    public static void changeColor(Car car, Colors color) {
        if ((car != null && color != null) && (car.color != color)) {
            car.setColor(color);
        }
    }
    public static void changeWheelSize(Car car, WheelSize wheelSize) {
        if ((car != null && wheelSize != null) && (car.wheelSize != wheelSize)) {
            car.setWheelSize(wheelSize);
        }
    }
    public static void addOption(Car car, Options option) {
        for (var i = 0; i < car.options.length; i++) {
            if (car.options[i] != null) {
                continue;
            } else {
                car.options[i] = option;
                break;
            }
        }
    }
    public static void deleteOption(Car car, Options option) {
        for (var i = 0; i < car.options.length; i++) {
            if (car.options[i] != option) {
                continue;
            } else {
                car.options[i] = null;
                break;
            }
        }
    }
    public void setOptions (Car car, Options[] options){
        car.options = options;
    }
}






