package dmitry.sokolov.homework.project.cars;

import dmitry.sokolov.homework.project.enums.carInterfaces.CarColors;
import dmitry.sokolov.homework.project.enums.carInterfaces.CarWheels;
import dmitry.sokolov.homework.project.enums.Options;
import dmitry.sokolov.homework.project.enums.fordEnums.*;
import dmitry.sokolov.homework.project.exceptions.CarParameterException;

public class Ford extends Car {

    private final FordFuelType fuelType;

    public Ford(FordColors color, FordModels model, int year, FordWheels wheelSize, FordEngines engineVol,
                Options[] options, FordFuelType fuelType) {
        super(color, model, year, wheelSize, engineVol, options);
        this.fuelType = fuelType;
    }

    public Ford(FordColors color, FordModels model, int year, FordWheels wheelSize, FordEngines engineVol,
                FordFuelType fuelType) {
        super(color, model, year, wheelSize, engineVol);
        this.fuelType = fuelType;
    }

    public FordFuelType getFuelType() {
        return fuelType;
    }

    @Override
    public void setColor(CarColors color) throws CarParameterException {
        if (color instanceof FordColors) {
            this.color = color;
        } else {
            throw new CarParameterException();
        }
    }

    @Override
    public void setWheelSize(CarWheels wheelSize) throws CarParameterException {
        if (wheelSize instanceof FordWheels) {
            this.wheelSize = wheelSize;
        } else {
            throw new CarParameterException();
        }
    }

    @Override
    public String toString() {
        return "Ford{" +
                "color=" + color +
                ", model=" + model +
                ", year=" + year +
                ", wheelSize=" + wheelSize +
                ", engineVol=" + engineVol +
                ", options=" + options +
                ", fuel type=" + fuelType +
                '}';
    }
}