package dmitry.sokolov.homework.third;

import dmitry.sokolov.homework.third.enums.*;

import java.util.Arrays;

import static java.lang.String.format;

public class Car {
    protected final int year;
    protected final Models model;
    protected final EngineVolumes EngineVolume;
    protected Colors color;
    protected WheelSize wheelSize;
    protected Options[] options;

    public Car(int year, Models model, EngineVolumes engineVolume, Colors color, WheelSize wheelSize) {
        this.year = year;
        this.model = model;
        this.EngineVolume = engineVolume;
        this.color = color;
        this.wheelSize = wheelSize;
    }

    public Colors getColor() {
        return color;
    }

    public WheelSize getWheelSize() {
        return wheelSize;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public void setWheelSize(WheelSize wheelSize) {
        this.wheelSize = wheelSize;
    }

    @Override
    public String toString() {
        return "Car: " +
                "year = " + year +
                ", model = " + model +
                ", EngineVolume = " + EngineVolume +
                ", color = " + color +
                ", wheelSize = " + wheelSize +
                ", options: " + Arrays.toString(options);
    }
}

