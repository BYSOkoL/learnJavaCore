package dmitry.sokolov.homework.third.service;

import dmitry.sokolov.homework.third.enums.Options;

import static dmitry.sokolov.homework.third.Car.carInfo;

public interface ServiceAddOptions {
    default void addOptions(Options option) {
        int i = 0;
        if (carInfo[5] == null) {
            i = 5;
        } else if (carInfo[6] == null) {
            i = 6;
        } else if (carInfo[7] == null) {
            i = 7;
        }
        for (; i < carInfo.length; i++) {
            carInfo[i] = option.toString();
            break;
        }
    }
}
