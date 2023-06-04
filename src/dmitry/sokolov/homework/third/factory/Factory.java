package dmitry.sokolov.homework.third.factory;

import dmitry.sokolov.homework.third.Car;
import dmitry.sokolov.homework.third.CreateCar;
import dmitry.sokolov.homework.third.Salon;
import dmitry.sokolov.homework.third.Service;
import dmitry.sokolov.homework.third.enums.*;

import static java.lang.String.format;

import java.time.Year;
import java.util.Arrays;

public class Factory implements CreateCar {
    private static final int YEAR = 2023;
    private final Colors[] colors;
    private final Models[] models;
    private final WheelSize[] wheelSizes;
    private final EngineVolumes[] engineVolumes;

    public Colors[] getColors() {
        return colors;
    }

    public Models[] getModels() {
        return models;
    }

    public WheelSize[] getWheelSizes() {
        return wheelSizes;
    }

    public EngineVolumes[] getEngineVolumes() {
        return engineVolumes;
    }

    protected Car[] storage;
    boolean correctProperties = false;
    boolean correctModel = false;
    boolean correctColor = false;
    boolean correctEngineVolume = false;
    boolean correctWheelSize = false;

    public Factory(Models[] models, Colors[] colors,  WheelSize[] wheelSizes, EngineVolumes[] engineVolume) {
        if (models == null || colors == null || engineVolume == null || wheelSizes == null) {
            System.out.println("null in factory");
        }
        this.colors = colors;
        this.models = models;
        this.wheelSizes = wheelSizes;
        this.engineVolumes = engineVolume;
        this.storage = new Car[10];
        this.storage[0] = new Car(2023, Models.A3, Colors.BLACK, EngineVolumes.VOLUME_1_4, WheelSize.BIG);
        this.storage[1] = new Car(2023, Models.A3, Colors.BLACK,  EngineVolumes.VOLUME_1_4, WheelSize.BIG);
    }


    public String toString() {
        return
                "Factory can produce: colors: " + Arrays.toString(colors) +
                        ", models: " + Arrays.toString(models) +
                        ", wheelSizes: " + Arrays.toString(wheelSizes) +
                        ", engineVolumes: " + Arrays.toString(engineVolumes);

    }

    @Override
    public Car create(int year, Models model, EngineVolumes engineVolume, Colors color, WheelSize wheelSize, Options[] options) {
            return new Car(year, model, color, engineVolume, wheelSize);
    }

    public Car orderCar(int year, Models model, Colors color, EngineVolumes engineVolume, WheelSize wheelSize, Options[] options) {
        if (options == null) {
            options = new Options[3];
        }
        Car a = new Car(YEAR, model, color, engineVolume, wheelSize);
        if (orderProperties(model, color, engineVolume, wheelSize)) {
            for (var j = 0; j < storage.length; j++) {
                if (storage[j] != null) {
                    if (((storage[j].getColor()).equals(a.getColor())) &&
                            ((storage[j].getModel()).equals(a.getModel())) &&
                            ((storage[j].getEngineVolume())).equals(a.getEngineVolume()) &&
                            ((storage[j].getWheelSize())).equals(a.getWheelSize())
                    ) {
                        if (Arrays.equals(storage[j].getOptions(), a.getOptions())) {
                        }
                        {
                            storage[j] = null;
                            System.out.println("Get car from storage: " + a.toString());
                            create(YEAR, model, engineVolume, color, wheelSize, options);
                            break;
                        }
                    }
                }
            }
        }
            return null;
    }
    private boolean orderProperties(Models model, Colors color, EngineVolumes engineVolume, WheelSize wheelSize) {

        for (var i = 0; i < models.length; i++) {
            if (models[i] == model) {
                correctModel = true;
            }
            if (colors[i] == color) {
                correctColor = true;
            }
            if (engineVolumes[i] == engineVolume) {
                correctEngineVolume = true;
            }
            if (wheelSizes[i] == wheelSize) {
                correctWheelSize = true;
            }
        }
        if (correctModel && correctColor && correctEngineVolume && correctWheelSize) {
            correctProperties = true;
        }
        return correctProperties;
    }
}

//    private Car forServiceCar(Car car, Colors color, WheelSize wheelSize) {
//
//        if (!car.getColor().equals(color)) {
//            Service.changeColor(car, color);
//        }
//        if (!car.getWheelSize().equals(wheelSize)) {
//            Service.changeWheelSize(car, wheelSize);
//        }
//
//
//}


