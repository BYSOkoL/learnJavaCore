package dmitry.sokolov.homework.third;

import dmitry.sokolov.homework.third.enums.Colors;
import dmitry.sokolov.homework.third.enums.Options;
import dmitry.sokolov.homework.third.enums.WheelSize;
import static java.lang.String.format;
public class Car {
    private static final String CAR_INFO = "CAR: {year: %s, model: %s engineVolume: %s, color: %s, wheelSize: %s, options: %s}";


    protected final int year;
    protected final String model;
    protected final double engineVolume;
    protected Colors color;
    protected WheelSize wheelSize;
    protected Options options;

    public Car(int year, String model, double engineVolume, Colors color, WheelSize wheelSize, Options options) {
        this.year = year;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.wheelSize = wheelSize;
        this.options = options;
    }

    public Car(int year, String model, double engineVolume, Colors color, WheelSize wheelSize) {
        this.year = year;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.wheelSize = wheelSize;
    }
    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public Colors getColor() {
        return color;
    }

    public WheelSize getWheelSize() {
        return wheelSize;
    }

    public Options getOptions() {
        return options;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public void setWheelSize(WheelSize wheelSize) {
        this.wheelSize = wheelSize;
    }

    public void setOptions(Options options) {
        this.options = options;
    }

    @Override
    public String toString() {
        return format(
                CAR_INFO,
                year,
                model,
                engineVolume,
                color,
                wheelSize,
                options
        );
    }
}
