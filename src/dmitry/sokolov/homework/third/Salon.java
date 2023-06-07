package dmitry.sokolov.homework.third;

import dmitry.sokolov.homework.third.enums.*;
import dmitry.sokolov.homework.third.factory.Factory;

public class Salon {
    protected Factory factory;
    protected Service service;
    public Car makeCarOrder (Model model, Color color, EngineVolume engineVolume, WheelSize wheelSize, Option[] options) {
       return factory.orderCar(model, color, engineVolume, wheelSize, options);
    }
    public void changeColor(Car car, Color color) {
        service.changeColor(car, color);
    }

    public void changeWheelSize(Car car, WheelSize wheelSize) {
        service.changeWheelSize(car, wheelSize);
    }

    public void addOption(Car car, Option option) {
        service.addOption(car, option);
    }

    public void deleteOption(Car car, Option option) {
        service.deleteOption(car, option);
    }
    public void setOption(Car car, Option[] options) {
        service.setOptions(car, options);
    }
}
