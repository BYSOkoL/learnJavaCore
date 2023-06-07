package dmitry.sokolov.homework.third;

import dmitry.sokolov.homework.third.enums.*;

import java.util.Arrays;

import static java.lang.String.format;

public class Car {
    protected final int year;
    protected final Model model;
    protected final dmitry.sokolov.homework.third.enums.EngineVolume EngineVolume;
    protected Color color;
    protected WheelSize wheelSize;
    protected Option[] options;

    public Car(int year, Model model, Color color, dmitry.sokolov.homework.third.enums.EngineVolume engineVolume, WheelSize wheelSize, Option[] options) {
        this.year = year;
        this.model = model;
        this.EngineVolume = engineVolume;
        this.color = color;
        this.wheelSize = wheelSize;
        this.options = options;
        if (options == null) {
            this.options = new Option[3];
        }

    }

    public Color getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public Model getModel() {
        return model;
    }

    public dmitry.sokolov.homework.third.enums.EngineVolume getEngineVolume() {
        return EngineVolume;
    }

    public WheelSize getWheelSize() {
        return wheelSize;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setWheelSize(WheelSize wheelSize) {
        this.wheelSize = wheelSize;
    }

    public Option[] getOptions() {
        return options;
    }

    public void setOptions(Option[] options) {
        this.options = options;
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

