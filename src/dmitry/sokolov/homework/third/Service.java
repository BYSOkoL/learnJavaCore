package dmitry.sokolov.homework.third;

import dmitry.sokolov.homework.third.Car;
import dmitry.sokolov.homework.third.enums.Colors;
import dmitry.sokolov.homework.third.enums.Options;
import dmitry.sokolov.homework.third.enums.WheelSize;

public class Service {
    Options[] options = new Options[3];
    public static void changeColor(Car car, Colors color) {
        if (car != null && color != null) {
            car.setColor(color);
        }
    }

    public static void changeWheelSize(Car car, WheelSize wheelSize) {
        if (car != null && wheelSize != null) {
            car.setWheelSize(wheelSize);
        }
    }

    public void addOption(Options option) {
        for (var i = 0; i < options.length; i++) {
            if (options[i] != null) {
                continue;
            } else {
                options[i] = option;
                break;
            }
        }
    }
    public void deleteOption(Options option) {
        for (var i = 0; i < options.length; i++) {
            if (options[i] != option) {
                continue;
            } else {
                options[i] = null;
                break;
            }
        }
    }
    public void setOptions (Car car){
        car.options = options;
    }
}






