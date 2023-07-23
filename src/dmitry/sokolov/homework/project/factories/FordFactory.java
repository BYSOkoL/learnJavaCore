package dmitry.sokolov.homework.project.factories;


import dmitry.sokolov.homework.project.carInfo.CarInfo;
import dmitry.sokolov.homework.project.carInfo.FordCarInfo;
import dmitry.sokolov.homework.project.cars.Car;
import dmitry.sokolov.homework.project.cars.Ford;
import dmitry.sokolov.homework.project.enums.carInterfaces.CarColors;
import dmitry.sokolov.homework.project.enums.carInterfaces.CarEngines;
import dmitry.sokolov.homework.project.enums.carInterfaces.CarModels;
import dmitry.sokolov.homework.project.enums.carInterfaces.CarWheels;
import dmitry.sokolov.homework.project.enums.Options;
import dmitry.sokolov.homework.project.enums.fordEnums.*;
import dmitry.sokolov.homework.project.service.ServiceList;

import java.util.Random;

public class FordFactory extends Factory<Ford> {

    public FordFactory(String factoryName, ServiceList services, FordModels[] models, FordColors[] colors,
                       FordEngines[] engines, FordWheels[] wheels) {
        super(factoryName, services, models, colors, engines, wheels);

        for (int i = 0; i < 5; i++) {
            storage.add((Ford) createCar(FordModels.values()[new Random().nextInt(FordModels.values().length)]
                    , FordColors.values()[new Random().nextInt(FordColors.values().length)]
                    , FordEngines.values()[new Random().nextInt(FordEngines.values().length)]
                    , FordWheels.values()[new Random().nextInt(FordWheels.values().length)]
                    , new Options[]{Options.values()[new Random().nextInt(Options.values().length)]}
                    , new FordCarInfo(FordFuelType.DIESEL)));
        }
    }

    public FordFactory(String factoryName, ServiceList services) {
        this(factoryName, services, FordModels.values(), FordColors.values(), FordEngines.values(),
                FordWheels.values());
    }

    @Override
    Car checkCarInStorage(CarModels model, CarColors color, CarEngines engine, CarWheels wheels,
                          Options[] options, CarInfo carInfo) {
        Car fordInStorage = null;
        synchronized (storage) {
            for (Ford ford : storage) {
                FordCarInfo fordCarInfo = (FordCarInfo) carInfo;
                if (ford.getModel().equals(model)
                        && ford.getEngineVol().equals(engine)
                        && ford.getFuelType().equals(fordCarInfo.getFuelType())) {
                    int currentChanges = findSuitableCar(ford, color, wheels, options);
                    if (currentChanges == 0) {
                        return ford;
                    } else {
                            fordInStorage = ford;
                    }
                }
            }
        }
        return fordInStorage;
    }

    @Override
    Car createCar(CarModels model, CarColors color, CarEngines engine, CarWheels wheels,
                  Options[] options, CarInfo carInfo) {
        int year = getYear();
        FordCarInfo fordCarInfo = (FordCarInfo) carInfo;
        FordFuelType fuelType = fordCarInfo.getFuelType();
        return new Ford((FordColors) color, (FordModels) model, year, (FordWheels) wheels,
                (FordEngines) engine, options, fuelType);
    }
}
