package dmitry.sokolov.homework.project.cars;

import dmitry.sokolov.homework.project.enums.*;
import dmitry.sokolov.homework.project.enums.bmwEnums.*;
import dmitry.sokolov.homework.project.enums.carInterfaces.CarColors;
import dmitry.sokolov.homework.project.enums.carInterfaces.CarWheels;
import dmitry.sokolov.homework.project.exceptions.CarParameterException;

public class BMW extends Car {

    private final BMWTransmission transmission;

    public BMW(BMWColors color, BMWModels model, int year, BMWWheels wheelSize, BMWEngines engineVol,
               Options[] options, BMWTransmission transmission) {
        super(color, model, year, wheelSize, engineVol, options);
        this.transmission = transmission;
    }

    public BMW(BMWColors color, BMWModels model, int year, BMWWheels wheelSize, BMWEngines engineVol,
               BMWTransmission transmission) {
        super(color, model, year, wheelSize, engineVol);
        this.transmission = transmission;
    }

    public BMWTransmission getTransmission() {
        return transmission;
    }

    @Override
    public void setColor(CarColors color) throws CarParameterException {

        if (color instanceof BMWColors) {
            this.color = color;
        } else {
            throw new CarParameterException();
        }
    }

    @Override
    public void setWheelSize(CarWheels wheelSize) throws CarParameterException {
        if (wheelSize instanceof BMWWheels) {
            this.wheelSize = wheelSize;
        } else {
            throw new CarParameterException();
        }
    }

    @Override
    public String toString() {
        return "BMW{" +
                "color=" + color +
                ", model=" + model +
                ", year=" + year +
                ", wheelSize=" + wheelSize +
                ", engineVol=" + engineVol +
                ", options=" + options +
                ", transmission=" + transmission +
                '}';
    }
}