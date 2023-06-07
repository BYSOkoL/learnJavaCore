package dmitry.sokolov.homework.third;

import dmitry.sokolov.homework.third.enums.*;
import dmitry.sokolov.homework.third.factory.Factory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory(new Models[] {Models.A3},new Colors[]{Colors.BLACK}, new WheelSize[] {WheelSize.BIG}, new EngineVolumes[]{EngineVolumes.VOLUME_1_4});
        factory.orderCar(2023, Models.A3, Colors.BLACK,  EngineVolumes.VOLUME_1_4, WheelSize.BIG, new Options[] {Options.ABS});
        Car car = new Car(2023, Models.A3, Colors.RED, EngineVolumes.VOLUME_1_4, WheelSize.BIG);
        System.out.println(car.toString());
        Service service = new Service();
        Service.addOption(car, Options.ESP);
        Service.addOption(car, Options.ABS);
        Service.deleteOption(car, Options.ESP);
        System.out.println(car.toString());
    }
}
