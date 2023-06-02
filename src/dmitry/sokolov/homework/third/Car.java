package dmitry.sokolov.homework.third;

import dmitry.sokolov.homework.third.enums.*;


import java.util.Arrays;

import static java.lang.String.format;

public class Car {
    public static String[] carInfo = new String[8];
    protected final int year;
    protected final Models model;
    protected final EngineVolumes EngengineVolume;
    protected Colors color;
    protected WheelSize wheelSize;
    protected Options options;
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
    public Car(int year, Models model, EngineVolumes engineVolume, Colors color, WheelSize wheelSize) {
        this.year = year;
        this.model = model;
        this.EngengineVolume = engineVolume;
        this.color = color;
        this.wheelSize = wheelSize;
    }
    public void getCarInfo() {
        carInfo[0] = String.valueOf(year);
        carInfo[1] = model.toString();
        carInfo[2] = EngengineVolume.toString();
        carInfo[3] = color.toString();
        carInfo[4] = wheelSize.toString();
        System.out.println(Arrays.toString(carInfo));
    }
}

