package dmitry.sokolov.homework.third;

import dmitry.sokolov.homework.third.enums.*;
import dmitry.sokolov.homework.third.factory.*;
import dmitry.sokolov.homework.third.service.Service;

public class Salon {
    public static void main(String[] args) {
        Car car = new Car(2023, Models.A4, EngineVolumes.VOLUME_1_4, Colors.RED, WheelSize.BIG);
        Service service = new Service();
        service.addOptions(Options.ABS);
        service.changeColor(car, Colors.BLACK);
        car.getCarInfo();
        Factory factory = new Factory(new Colors[]{Colors.RED, Colors.BLACK}, new Models[]{Models.A5, Models.A3},
                new WheelSize[]{WheelSize.BIG, WheelSize.MEDIUM},
                new EngineVolumes[]{EngineVolumes.VOLUME_1_4, EngineVolumes.VoLUME_1_8});
        System.out.println(factory.getConfigurations());
    }
}
