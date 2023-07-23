package dmitry.sokolov.homework.project.factories;

import dmitry.sokolov.homework.project.carInfo.CarInfo;
import dmitry.sokolov.homework.project.cars.Car;
import dmitry.sokolov.homework.project.enums.carInterfaces.CarColors;
import dmitry.sokolov.homework.project.enums.carInterfaces.CarEngines;
import dmitry.sokolov.homework.project.enums.carInterfaces.CarModels;
import dmitry.sokolov.homework.project.enums.carInterfaces.CarWheels;
import dmitry.sokolov.homework.project.enums.Options;
import dmitry.sokolov.homework.project.exceptions.CarParameterException;
import dmitry.sokolov.homework.project.exceptions.CarValidationException;
import dmitry.sokolov.homework.project.service.*;

import java.util.*;

public abstract class Factory<T extends Car> {

    private final List<Serviceable> services;
    protected final List<T> storage;
    private final Set<CarModels> models;
    private final Set<CarColors> colors;
    private final Set<CarEngines> engines;
    private final Set<CarWheels> wheels;
    private final String factoryName;
    protected boolean exactCarFound;

    public Factory(String factoryName, ServiceList services, CarModels[] models, CarColors[] colors,
                   CarEngines[] engines, CarWheels[] wheels)
            throws NullPointerException {
        if (services == null
                || models == null
                || colors == null
                || engines == null
                || wheels == null) {
            throw new NullPointerException();
        }

        this.factoryName = factoryName;
        this.services = services
                .getServiceList();
        this.models = new HashSet(Arrays
                .asList(models));
        this.colors = new HashSet(Arrays
                .asList(colors));
        this.engines = new HashSet(Arrays
                .asList(engines));
        this.wheels = new HashSet(Arrays
                .asList(wheels));
        storage = new ArrayList<>();
    }

    public Car orderCar(CarModels model, CarColors color, CarEngines engine, CarWheels wheels,
                        Options[] options, CarInfo carInfo)
            throws CarValidationException, NullPointerException {
        if (model == null
                || color == null
                || engine == null
                || wheels == null
                || carInfo == null) {
            throw new NullPointerException();
        }
        if (options == null) {
            options = new Options[0];
        }

        Car carInStorage;

        if (orderValidation(model, color, engine, wheels)) {
            carInStorage = checkCarInStorage(model, color, engine, wheels, options, carInfo);
            if (carInStorage != null) {
                synchronized (storage) {
                    storage
                            .remove(carInStorage);
                }
                if (!exactCarFound) {
                    serviceCar(carInStorage, color, wheels, options);
                }
                exactCarFound = false;
                return carInStorage;
            } else {
                return createCar(model, color, engine, wheels, options, carInfo);
            }
        } else {
            throw new CarValidationException();
        }
    }


    private boolean orderValidation(CarModels model, CarColors color, CarEngines engine, CarWheels wheels) {
        return this.models.contains(model)
                && this.colors.contains(color)
                && this.engines.contains(engine)
                && this.wheels.contains(wheels);
    }

    abstract Car checkCarInStorage(CarModels model, CarColors color, CarEngines engine, CarWheels wheels,
                                   Options[] options, CarInfo carInfo);

    protected int findSuitableCar(Car car, CarColors color, CarWheels wheels, Options[] options) {

        int changesToDo = 0;

        if (!car.getColor().equals(color)) {
            changesToDo++;
            if (!car.getWheelSize().equals(wheels)) {
                changesToDo++;
            }
            changesToDo += getNumberOfDifferentOptions(car, options);
        }
        return changesToDo;
    }

    protected int getNumberOfDifferentOptions(Car car, Options[] options) {
        int numberOfDifferentOptions = (int) car
                .getOptions()
                .stream()
                .filter(carOption -> !Arrays
                        .asList(options)
                        .contains(carOption))
                .count();
        numberOfDifferentOptions += (int) Arrays
                .stream(options)
                .filter(option -> !car
                        .getOptions()
                        .contains(option))
                .count();
        return numberOfDifferentOptions;
    }

    private void serviceCar(Car car, CarColors color, CarWheels wheels, Options[] options) {

        if (!car.getColor().equals(color)) {
            changeColor(car, color);
        }

        if (!car.getWheelSize().equals(wheels)) {
            changeWheels(car, wheels);
        }

        List<Options> optionsToDelete = car
                .getOptions()
                .stream()
                .filter(option -> !Arrays.asList(options)
                        .contains(option))
                .toList();
        if (optionsToDelete.size() > 0) {
            optionsToDelete.stream().forEach(option -> removeOption(car, option));
        }

        List<Options> optionsToAdd = Arrays
                .stream(options)
                .filter(option -> !car.getOptions()
                .contains(option))
                .toList();
        if (optionsToAdd.size() > 0) {
            optionsToAdd.stream().forEach(option -> addOption(car, option));
        }
    }

    private void changeColor(Car car, CarColors color) {
        try {
            services.stream().filter(serviceable -> serviceable instanceof ColorService)
                    .findFirst()
                    .get()
                    .makeOperation(car, color);
        } catch (CarParameterException e) {
            System.out.println(e.getMessage());
        }
    }

    private void changeWheels(Car car, CarWheels wheels) {
        try {
            services.stream().filter(serviceable -> serviceable instanceof WheelService)
                    .findFirst()
                    .get()
                    .makeOperation(car, wheels);
        } catch (CarParameterException e) {
            System.out.println(e.getMessage());
        }
    }

    private void addOption(Car car, Options option) {
        try {
            services.stream().filter(serviceable -> serviceable instanceof AddOptionService)
                    .findFirst()
                    .get()
                    .makeOperation(car, option);
        } catch (CarParameterException e) {
            System.out.println(e.getMessage());
        }
    }

    private void removeOption(Car car, Options option) {
        try {
            services.stream().filter(serviceable -> serviceable instanceof DeleteOptionService)
                    .findFirst()
                    .get()
                    .makeOperation(car, option);
        } catch (CarParameterException e) {
            System.out.println(e.getMessage());
        }
    }

    abstract Car createCar(CarModels model, CarColors color, CarEngines engine, CarWheels wheels,
                           Options[] options, CarInfo carInfo);

    protected int getYear() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.YEAR);
    }

    public void showStorage() {
        System.out.println(factoryName + " contains " + storage.size() + " cars");
        storage.stream().forEach(car -> System.out.println(car.toString()));
        System.out.println("------------------");
    }

    public void info() {
        System.out.println(factoryName + " info:");
        System.out.println("available models " + models);
        System.out.println("available colors " + colors);
        System.out.println("available engines " + engines);
        System.out.println("available wheels " + wheels);
        System.out.println("------------------");
    }

}