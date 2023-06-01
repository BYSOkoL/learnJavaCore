package dmitry.sokolov.homework.third.service;

import dmitry.sokolov.homework.third.Car;
import dmitry.sokolov.homework.third.enums.Colors;

public interface ServiceForChangeColor {
        default void changeColor(Car car, Colors color) {
            if (car != null && color != null) {
                car.setColor(color);
            }
        }

}
