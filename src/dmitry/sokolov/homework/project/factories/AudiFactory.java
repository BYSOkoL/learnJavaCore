package dmitry.sokolov.homework.project.factories;


import dmitry.sokolov.homework.project.carInfo.CarInfo;
import dmitry.sokolov.homework.project.carInfo.AudiCarInfo;
import dmitry.sokolov.homework.project.cars.Car;
import dmitry.sokolov.homework.project.cars.Audi;
import dmitry.sokolov.homework.project.enums.carInterfaces.CarColors;
import dmitry.sokolov.homework.project.enums.carInterfaces.CarEngines;
import dmitry.sokolov.homework.project.enums.carInterfaces.CarModels;
import dmitry.sokolov.homework.project.enums.carInterfaces.CarWheels;
import dmitry.sokolov.homework.project.enums.Options;
import dmitry.sokolov.homework.project.enums.audiEnums.*;
import dmitry.sokolov.homework.project.service.ServiceList;

import java.util.Random;

public class AudiFactory extends Factory<Audi> {

    public AudiFactory(String factoryName, ServiceList services, AudiCarModels[] models, AudiCarColors[] colors,
                       AudiCarEngines[] engines, AudiCarWheels[] wheels) {
        super(factoryName, services, models, colors, engines, wheels);

        for (int i = 0; i < 5; i++) {
            storage.add((Audi) createCar(AudiCarModels.values()[new Random().nextInt(AudiCarModels.values().length)]
                    , AudiCarColors.values()[new Random().nextInt(AudiCarColors.values().length)]
                    , AudiCarEngines.values()[new Random().nextInt(AudiCarEngines.values().length)]
                    , AudiCarWheels.values()[new Random().nextInt(AudiCarWheels.values().length)]
                    , new Options[]{Options.values()[new Random().nextInt(Options.values().length)]}
                    , new AudiCarInfo(AudiCarType.values()[new Random().nextInt(AudiCarType.values().length)])));
        }
    }

    public AudiFactory(String factoryName, ServiceList services) {
        this(factoryName, services, AudiCarModels.values(), AudiCarColors.values(), AudiCarEngines.values(), AudiCarWheels.values());
    }

    @Override
    Car checkCarInStorage(CarModels model, CarColors color, CarEngines engine, CarWheels wheels, Options[] options, CarInfo carInfo) {
        Car audiInStorage = null;
        synchronized (storage) {
            for (Audi car : storage) {
                AudiCarInfo audiCarInfo = (AudiCarInfo) carInfo;
                if (car.getModel().equals(model)
                        && car.getEngineVol().equals(engine)
                        && car.getAudiCarType().equals(audiCarInfo.getAudiCarType())) {
                    int currentChanges = findSuitableCar(car, color, wheels, options);
                    if (currentChanges == 0) {
                        return car;
                    } else {
                            audiInStorage = car;
                    }
                }
            }
        }
        return audiInStorage;
    }


    @Override
    Car createCar(CarModels model, CarColors color, CarEngines engine, CarWheels wheels, Options[] options,
                  CarInfo carInfo) {
        int year = getYear();
        AudiCarInfo audiCarInfo = (AudiCarInfo) carInfo;
        AudiCarType audiCarType = audiCarInfo.getAudiCarType();
        return new Audi((AudiCarColors) color, (AudiCarModels) model, year, (AudiCarWheels) wheels,
                (AudiCarEngines) engine, options, audiCarType);
    }
}