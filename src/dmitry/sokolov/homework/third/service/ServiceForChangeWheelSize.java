package dmitry.sokolov.homework.third.service;
import dmitry.sokolov.homework.third.enums.*;
import dmitry.sokolov.homework.third.*;

public interface ServiceForChangeWheelSize {
    default void changeWheelSize(Car car, WheelSize wheelSize) {
        if (car != null && wheelSize != null)  {
                car.setWheelSize(wheelSize);
        }
    }
}

