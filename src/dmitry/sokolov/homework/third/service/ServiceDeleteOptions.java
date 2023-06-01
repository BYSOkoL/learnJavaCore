package dmitry.sokolov.homework.third.service;

import dmitry.sokolov.homework.third.enums.Options;

import static dmitry.sokolov.homework.third.Car.carInfo;

public interface ServiceDeleteOptions {
    default void deleteOptions(Options option) {
        for (int i = 5; i < carInfo.length; i++) {
            if (carInfo[i].equalsIgnoreCase(option.toString())) {
                carInfo[i] = null;
            }
        }
    }
}
