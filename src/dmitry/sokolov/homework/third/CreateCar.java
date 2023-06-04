package dmitry.sokolov.homework.third;

import dmitry.sokolov.homework.third.enums.*;

public interface CreateCar {

        Car create(int year, Models model, EngineVolumes engineVolume, Colors color, WheelSize wheelSize, Options[] options);
    }


