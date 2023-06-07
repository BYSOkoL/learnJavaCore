package dmitry.sokolov.homework.third.factory;

import dmitry.sokolov.homework.third.Car;
import dmitry.sokolov.homework.third.CreateCar;
import dmitry.sokolov.homework.third.enums.*;

import static java.lang.String.format;

import java.util.Arrays;

public class Factory implements CreateCar {
    private static final int YEAR = 2023;
    private final Color[] colors;
    private final Model[] models;
    private final WheelSize[] wheelSizes;
    private final EngineVolume[] engineVolumes;

    public Color[] getColors() {
        return colors;
    }

    public Model[] getModels() {
        return models;
    }

    public WheelSize[] getWheelSizes() {
        return wheelSizes;
    }

    public EngineVolume[] getEngineVolumes() {
        return engineVolumes;
    }

    protected Car[] storage;

    public Factory(Model[] models, Color[] colors, WheelSize[] wheelSizes, EngineVolume[] engineVolume) {
        if (models == null || colors == null || engineVolume == null || wheelSizes == null) {
            System.out.println("null in factory");
        }
        this.colors = colors;
        this.models = models;
        this.wheelSizes = wheelSizes;
        this.engineVolumes = engineVolume;
        this.storage = new Car[10];
        this.storage[0] = new Car(2023, Model.A3, Color.BLACK, EngineVolume.VOLUME_1_4, WheelSize.BIG, new Option[]{Option.PDC});
        this.storage[1] = new Car(2023, Model.A3, Color.BLACK, EngineVolume.VOLUME_1_4, WheelSize.BIG, new Option[]{Option.PDC});
    }


    public String toString() {
        return
                "Factory can produce: colors: " + Arrays.toString(colors) +
                        ", models: " + Arrays.toString(models) +
                        ", wheelSizes: " + Arrays.toString(wheelSizes) +
                        ", engineVolumes: " + Arrays.toString(engineVolumes);

    }

    @Override
    public Car create(Model model, EngineVolume engineVolume, Color color, WheelSize wheelSize, Option[] options) {
        return new Car(YEAR, model, color, engineVolume, wheelSize, options);
    }

    public Car orderCar(Model model, Color color, EngineVolume engineVolume, WheelSize wheelSize, Option[] options) {
        if (options == null) {
            options = new Option[3];
        }
        Car a = new Car(YEAR, model, color, engineVolume, wheelSize, options);
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
                            return a;
                        }
                    }
                }
            }
        }
        return create(model, engineVolume, color, wheelSize, options);
    }

    private boolean orderProperties(Model model, Color color, EngineVolume engineVolume, WheelSize wheelSize) {
        boolean correctProperties = false;
        boolean correctModel = false;
        boolean correctColor = false;
        boolean correctEngineVolume = false;
        boolean correctWheelSize = false;
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

//    private Car forServiceCar(Car car, Color color, WheelSize wheelSize) {
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


