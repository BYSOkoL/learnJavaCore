package dmitry.sokolov.classwork.carsClass;

import java.util.Random;

public class Car {
    private final String name;
    private final CarModel carModel;
    private final int engineCapacity;

    public Car(String name, CarModel carModel, int engineCapacity) {
        this.name = name;
        this.carModel = carModel;
        this.engineCapacity = engineCapacity;
    }

    public int getEngineCapacity() {
        return engineCapacity;

    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", carModel=" + carModel +
                ", engineCapacity=" + engineCapacity +
                '}';
    }

}
