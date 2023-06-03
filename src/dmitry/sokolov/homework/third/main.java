package dmitry.sokolov.homework.third;

import dmitry.sokolov.homework.third.enums.*;
import dmitry.sokolov.homework.third.*;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        Car car = new Car(1044, Models.A3, EngineVolumes.VOLUME_1_4, Colors.BLACK, WheelSize.BIG);
        Service service = new Service();
        service.addOption(Options.ESP);
        service.addOption(Options.ABS);
        service.deleteOption(Options.ABS);
        service.setOptions(car);
        System.out.println(car.toString());
    }
}
