package dmitry.sokolov.homework.third;

import dmitry.sokolov.homework.third.enums.*;

public interface CreateCar {
        Car create(Model model, EngineVolume engineVolume, Color color, WheelSize wheelSize, Option[] options);
    }


