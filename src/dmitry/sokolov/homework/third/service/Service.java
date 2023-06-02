package dmitry.sokolov.homework.third.service;

import dmitry.sokolov.homework.third.Car;
import dmitry.sokolov.homework.third.enums.Colors;
import dmitry.sokolov.homework.third.enums.Options;
import dmitry.sokolov.homework.third.enums.WheelSize;

public class Service implements ServiceAddOptions, ServiceDeleteOptions, ServiceForChangeWheelSize, ServiceForChangeColor {
    @Override
    public void addOptions(Options option) {
        ServiceAddOptions.super.addOptions(option);
    }

    @Override
    public void deleteOptions(Options option) {
        ServiceDeleteOptions.super.deleteOptions(option);
    }

    @Override
    public void changeColor(Car car, Colors color) {
        ServiceForChangeColor.super.changeColor(car, color);
    }

    @Override
    public void changeWheelSize(Car car, WheelSize wheelSize) {
        ServiceForChangeWheelSize.super.changeWheelSize(car, wheelSize);
    }
}
