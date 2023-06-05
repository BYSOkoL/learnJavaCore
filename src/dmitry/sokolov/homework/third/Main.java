package dmitry.sokolov.homework.third;

import dmitry.sokolov.homework.third.enums.*;
import dmitry.sokolov.homework.third.factory.Factory;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        Service.addOption(Options.ESP);
        Service.addOption(Options.ABS);
        Service.deleteOption(Options.ABS);
        Factory factory = new Factory(new Models[] {Models.A3},new Colors[]{Colors.BLACK}, new WheelSize[] {WheelSize.BIG}, new EngineVolumes[]{EngineVolumes.VOLUME_1_4});

       factory.orderCar(2023, Models.A3, Colors.BLACK,  EngineVolumes.VOLUME_1_4, WheelSize.BIG, new Options[] {Options.ABS});
//        Car car = new Car(2023, Colors.RED, Models.A3, EngineVolumes.VOLUME_1_4, WheelSize.BIG, new Options[] {Options.ABS});
//        System.out.println(car.toString());
    }
}
