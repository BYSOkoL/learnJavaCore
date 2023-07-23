package dmitry.sokolov.homework.project.cars;

import dmitry.sokolov.homework.project.enums.*;
import dmitry.sokolov.homework.project.enums.carInterfaces.CarColors;
import dmitry.sokolov.homework.project.enums.carInterfaces.CarWheels;
import dmitry.sokolov.homework.project.enums.audiEnums.*;
import dmitry.sokolov.homework.project.exceptions.CarParameterException;

public class Audi extends Car {

    private final AudiCarType audiCarType;

    public Audi(AudiCarColors color, AudiCarModels model, int year, AudiCarWheels wheelSize,
                AudiCarEngines engineVol, Options[] options, AudiCarType audiCarType) {
        super(color, model, year, wheelSize, engineVol, options);
        this.audiCarType = audiCarType;
    }

    public Audi(AudiCarColors color, AudiCarModels model, int year, AudiCarWheels wheelSize,
                AudiCarEngines engineVol, AudiCarType audiCarType) {
        super(color, model, year, wheelSize, engineVol);
        this.audiCarType = audiCarType;
    }

    @Override
    public void setColor(CarColors color) throws CarParameterException {
        if (color instanceof AudiCarColors) {
            this.color = color;
        } else {
            throw new CarParameterException();
        }
    }

    @Override
    public void setWheelSize(CarWheels wheelSize) throws CarParameterException {
        if (wheelSize instanceof AudiCarWheels) {
            this.wheelSize = wheelSize;
        } else {
            throw new CarParameterException();
        }
    }

    public AudiCarType getAudiCarType() {
        return audiCarType;
    }

    @Override
    public String toString() {
        return "Audi{" +
                "color=" + color +
                ", model=" + model +
                ", year=" + year +
                ", wheelSize=" + wheelSize +
                ", engineVol=" + engineVol +
                ", options=" + options +
                ", car type=" + audiCarType +
                '}';
    }
}
