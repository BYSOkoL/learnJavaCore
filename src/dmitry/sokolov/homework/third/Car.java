package dmitry.sokolov.homework.third;

import dmitry.sokolov.homework.third.enums.Colors;
import dmitry.sokolov.homework.third.enums.Options;
import dmitry.sokolov.homework.third.enums.WheelSize;


import java.util.Arrays;

import static java.lang.String.format;

public class Car {
    public static String[] carInfo = new String[8];
    protected final int year;
    protected final String model;
    protected final double engineVolume;
    protected Colors color;
    protected WheelSize wheelSize;
    protected Options options;

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

    public Car(int year, String model, double engineVolume, Colors color, WheelSize wheelSize) {
        this.year = year;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.wheelSize = wheelSize;
    }

    public void getCarInfo() {
        carInfo[0] = String.valueOf(year);
        carInfo[1] = model.toString();
        carInfo[2] = String.valueOf(engineVolume);
        carInfo[3] = color.toString();
        carInfo[4] = wheelSize.toString();
        System.out.println(Arrays.toString(carInfo));
    }
}

