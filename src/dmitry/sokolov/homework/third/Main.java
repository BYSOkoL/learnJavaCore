package dmitry.sokolov.homework.third;

import dmitry.sokolov.homework.third.enums.*;
import dmitry.sokolov.homework.third.factory.Factory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory(new Model[] {Model.A3},new Color[]{Color.BLACK}, new WheelSize[] {WheelSize.BIG}, new EngineVolume[]{EngineVolume.VOLUME_1_4});
        Car ca2r = factory.orderCar(Model.A3, Color.RED, EngineVolume.VOLUME_1_4, WheelSize.MEDIUM, new Option[] {Option.ABS, Option.ESP});
        Car car = new Car (2023, Model.A3, Color.RED, EngineVolume.VOLUME_1_4, WheelSize.BIG, new Option[] {Option.ABS});
        System.out.println(car.toString());
        Service service = new Service();
        service.addOption(car, Option.PDC);
        service.addOption(car, Option.ABS);
        System.out.println(car.toString());
        service.deleteOption(car, Option.ABS);
        service.deleteOption(car, Option.PDC);
        service.deleteOption(car, Option.ESP);
        System.out.println(car.toString());
    }
}
