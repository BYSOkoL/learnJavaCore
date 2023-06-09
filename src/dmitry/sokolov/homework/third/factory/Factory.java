package dmitry.sokolov.homework.third.factory;

import dmitry.sokolov.homework.third.Car;
import dmitry.sokolov.homework.third.CreateCar;
import dmitry.sokolov.homework.third.Service;
import dmitry.sokolov.homework.third.enums.*;

import java.util.Arrays;

public class Factory implements CreateCar {
    private static final int YEAR = 2023;
    private final Color[] colors;
    private final Model[] models;
    private final WheelSize[] wheelSizes;
    private final EngineVolume[] engineVolumes;
    //    protected Car[] storage;
    protected Storage storage;

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


    public Factory(Model[] models, Color[] colors, WheelSize[] wheelSizes, EngineVolume[] engineVolume) {
        if (models == null || colors == null || engineVolume == null || wheelSizes == null) {
            System.out.println("null in factory");
        }
        this.colors = colors;
        this.models = models;
        this.wheelSizes = wheelSizes;
        this.engineVolumes = engineVolume;
        storage = new Storage(new Car[]{create(Model.A3, EngineVolume.VOLUME_1_4, Color.RED, WheelSize.BIG, new Option[]{Option.PDC, Option.ABS}),
                create(Model.A3, EngineVolume.VOLUME_1_4, Color.RED, WheelSize.BIG, new Option[]{Option.PDC, Option.ABS}),
                create(Model.A3, EngineVolume.VOLUME_1_4, Color.RED, WheelSize.BIG, new Option[]{Option.PDC, Option.ABS})});
    }


    public String toString() {
        return
                "Factory can produce: colors: " + Arrays.toString(colors) +
                        ", models: " + Arrays.toString(models) +
                        ", wheelSizes: " + Arrays.toString(wheelSizes) +
                        ", engineVolumes: " + Arrays.toString(engineVolumes) +
                        ", \n storage: " + Arrays.toString(storage.getStorage());

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
            for (var j = 0; j < storage.getStorage().length; j++) {
                if (storage.getStorage()[j] != null) {
                    if (((storage.getStorage()[j].getColor()).equals(a.getColor())) &&
                            ((storage.getStorage()[j].getModel()).equals(a.getModel())) &&
                            ((storage.getStorage()[j].getEngineVolume()).equals(a.getEngineVolume())) &&
                            ((storage.getStorage()[j].getWheelSize()).equals(a.getWheelSize()))) {
                        if (Arrays.equals(storage.getStorage()[j].getOptions(), a.getOptions())) {
                            storage.deleteFromStorage(a);
                            System.out.println("Get car from storage: " + a.toString());
                            return a;
                        } else {
                            Service.setOptions(a, options);
                            storage.deleteFromStorage(a);
                            System.out.println("Get car from storage + set options: " + a.toString());
                            return a;
                        }
                    } else if (((storage.getStorage()[j].getModel()).equals(a.getModel())) &&
                            ((storage.getStorage()[j].getEngineVolume())).equals(a.getEngineVolume())) {
                        if ((!(storage.getStorage()[j].getColor()).equals(a.getColor()))) {
                            Service.changeColor(a, color);
                        }
                        if ((!(storage.getStorage()[j].getWheelSize()).equals(a.getWheelSize()))) {
                            Service.changeWheelSize(a, wheelSize);
                        }
                        if (Arrays.equals(storage.getStorage()[j].getOptions(), a.getOptions())) {
                            storage.deleteFromStorage(a);
                            System.out.println("Get car from storage + service works: " + a.toString());
                            return a;
                        } else {
                            Service.setOptions(a, options);
                            storage.deleteFromStorage(a);
                            System.out.println("Get car from storage + set options + service works: " + a.toString());
                            return a;
                        }
                    }
                }
            }
        }
        return create(model, engineVolume, color, wheelSize, options);
    }

    private boolean orderProperties(Model model, Color
            color, EngineVolume engineVolume, WheelSize wheelSize) {
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


