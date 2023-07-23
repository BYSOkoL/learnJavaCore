package dmitry.sokolov.homework.project.factories;

import dmitry.sokolov.homework.project.carInfo.BMWCarInfo;
import dmitry.sokolov.homework.project.carInfo.CarInfo;
import dmitry.sokolov.homework.project.cars.BMW;
import dmitry.sokolov.homework.project.cars.Car;
import dmitry.sokolov.homework.project.enums.bmwEnums.*;
import dmitry.sokolov.homework.project.enums.carInterfaces.CarColors;
import dmitry.sokolov.homework.project.enums.carInterfaces.CarEngines;
import dmitry.sokolov.homework.project.enums.carInterfaces.CarModels;
import dmitry.sokolov.homework.project.enums.carInterfaces.CarWheels;
import dmitry.sokolov.homework.project.enums.Options;
import dmitry.sokolov.homework.project.service.ServiceList;

import java.util.Random;


public class BMWFactory extends Factory<BMW> {

    public BMWFactory(String factoryName, ServiceList services, BMWModels[] models, BMWColors[] colors,
                      BMWEngines[] engines, BMWWheels[] wheels) {
        super(factoryName, services, models, colors, engines, wheels);

        for (int i = 0; i < 5; i++) {
            storage.add((BMW) createCar(BMWModels.values()[new Random().nextInt(BMWModels.values().length)]
                    , BMWColors.values()[new Random().nextInt(BMWColors.values().length)]
                    , BMWEngines.BMW_ENGINE_1
                    , BMWWheels.values()[new Random().nextInt(BMWWheels.values().length)]
                    , new Options[]{Options.values()[new Random().nextInt(Options.values().length)]}
                    , new BMWCarInfo(BMWTransmission.MT)));
        }
    }
    public BMWFactory(String factoryName, ServiceList services) {
        this(factoryName, services, BMWModels.values(), BMWColors.values(), BMWEngines.values(), BMWWheels.values());
    }
    @Override
    Car checkCarInStorage(CarModels model, CarColors color, CarEngines engine, CarWheels wheels,
                          Options[] options, CarInfo carInfo) {
        Car bmwInStorage = null;
        synchronized (storage) {
            for (BMW BMW : storage) {
                BMWCarInfo BMWCarInfo = (BMWCarInfo) carInfo;
                if (BMW.getModel().equals(model)
                        && BMW.getEngineVol().equals(engine)
                        && BMW.getTransmission() == BMWCarInfo.getTransmission()) {
                    int currentChanges = findSuitableCar(BMW, color, wheels, options);
                    if (currentChanges == 0) {
                        return BMW;
                    } else {
                            bmwInStorage = BMW;
                    }
                }
            }
        }
        return bmwInStorage;
    }
    @Override
    Car createCar(CarModels model, CarColors color, CarEngines engine, CarWheels wheels, Options[] options,
                  CarInfo carInfo) {
        int year = getYear();
        BMWCarInfo BMWCarInfo = (BMWCarInfo) carInfo;
        BMWTransmission transmission = BMWCarInfo.getTransmission();
        return new BMW((BMWColors) color, (BMWModels) model, year, (BMWWheels) wheels, (BMWEngines) engine,
                options, transmission);
    }
}