package dmitry.sokolov.homework.project;

import dmitry.sokolov.homework.project.carInfo.BMWCarInfo;
import dmitry.sokolov.homework.project.carInfo.CarInfo;
import dmitry.sokolov.homework.project.carInfo.AudiCarInfo;
import dmitry.sokolov.homework.project.carInfo.FordCarInfo;
import dmitry.sokolov.homework.project.cars.BMW;
import dmitry.sokolov.homework.project.cars.Car;
import dmitry.sokolov.homework.project.cars.Audi;
import dmitry.sokolov.homework.project.cars.Ford;
import dmitry.sokolov.homework.project.enums.bmwEnums.*;
import dmitry.sokolov.homework.project.enums.carInterfaces.CarColors;
import dmitry.sokolov.homework.project.enums.carInterfaces.CarWheels;
import dmitry.sokolov.homework.project.enums.Options;
import dmitry.sokolov.homework.project.enums.audiEnums.*;
import dmitry.sokolov.homework.project.enums.fordEnums.*;
import dmitry.sokolov.homework.project.exceptions.CarParameterException;
import dmitry.sokolov.homework.project.exceptions.CarValidationException;
import dmitry.sokolov.homework.project.exceptions.FactoryNotFoundException;
import dmitry.sokolov.homework.project.factories.BMWFactory;
import dmitry.sokolov.homework.project.factories.Factory;
import dmitry.sokolov.homework.project.factories.AudiFactory;
import dmitry.sokolov.homework.project.factories.FordFactory;
import dmitry.sokolov.homework.project.service.*;

import java.util.Arrays;
import java.util.List;

public class Salon {

    private List<Serviceable> services;
    private List<Factory> factories;

    public Salon(ServiceList services, List<Factory> factories) {
        this.services = services.getServiceList();
        this.factories = factories;
    }

    public BMW orderBMW(BMWModels model, BMWColors color, BMWEngines engine,
                        BMWWheels wheels, BMWTransmission transmission, Options... options)
            throws FactoryNotFoundException {

        if (model == null
                || color == null
                || engine == null
                || wheels == null
                || transmission == null) {
            throw new NullPointerException();
        }

        CarInfo bmwInfo = new BMWCarInfo(transmission);

        for (Factory factory : factories) {
            if (factory instanceof BMWFactory) {
                try {
                    return (BMW) factory.orderCar(model, color, engine, wheels, options, bmwInfo);
                } catch (CarValidationException exception) {
                }
            }
        }
        throw new FactoryNotFoundException("No factories available for this order");
    }

    public Ford orderFord(FordModels model, FordColors color, FordEngines engine,
                          FordWheels wheels, FordFuelType fuelType, Options... options)
            throws FactoryNotFoundException {

        if (model == null
                || color == null
                || engine == null
                || wheels == null
                || fuelType == null) {
            throw new NullPointerException();
        }

        CarInfo fordInfo = new FordCarInfo(fuelType);

        for (Factory factory : factories) {
            if (factory instanceof FordFactory) {
                try {
                    return (Ford) factory.orderCar(model, color, engine, wheels, options, fordInfo);
                } catch (CarValidationException exception) {
                }
            }
        }
        throw new FactoryNotFoundException();
    }

    public Audi orderAudi(AudiCarModels model, AudiCarColors color, AudiCarEngines engine,
                          AudiCarWheels wheels, AudiCarType audiCarType, Options... options) throws FactoryNotFoundException {

        if (model == null
                || color == null
                || engine == null
                || wheels == null
                || audiCarType == null) {
            throw new NullPointerException();
        }

        CarInfo audiInfo = new AudiCarInfo(audiCarType);

        for (Factory factory : factories) {
            if (factory instanceof AudiFactory) {
                try {
                    return (Audi) factory.orderCar(model, color, engine, wheels, options, audiInfo);
                } catch (CarValidationException exception) {
                }
            }
        }
        throw new FactoryNotFoundException();
    }

    public void serviceBMW(BMW BMW, BMWColors color, BMWWheels BMWWheels, boolean addOrDeleteOptions,
                           Options... options) {
        if (BMW == null) {
            throw new NullPointerException();
        }

        if (color != null) {
            changeColor(BMW, color);
        }

        if (BMWWheels != null) {
            changeWheels(BMW, BMWWheels);
        }

        if (options != null) {
            if (addOrDeleteOptions) {
                addOption(BMW, options);
            } else {
                deleteOption(BMW, options);
            }
        }
    }

    public void serviceAudi(Audi car, AudiCarColors color, AudiCarWheels audiCarWheels, boolean addOrDeleteOptions,
                            Options... options) {
        if (car == null) {
            throw new NullPointerException();
        }

        if (color != null) {
            changeColor(car, color);
        }

        if (audiCarWheels != null) {
            changeWheels(car, audiCarWheels);
        }

        if (options != null) {
            if (addOrDeleteOptions) {
                addOption(car, options);
            } else {
                deleteOption(car, options);
            }
        }
    }

    public void serviceFord(Ford ford, FordColors color, FordWheels fordWheels, boolean addOrDeleteOptions,
                            Options... options) {
        if (ford == null) {
            throw new NullPointerException();
        }

        if (color != null) {
            changeColor(ford, color);
        }

        if (fordWheels != null) {
            changeWheels(ford, fordWheels);
        }

        if (options != null) {
            if (addOrDeleteOptions) {
                addOption(ford, options);
            } else {
                deleteOption(ford, options);
            }
        }
    }

    private void changeColor(Car car, CarColors color) {
        try {
            services
                    .stream()
                    .filter(serviceable -> serviceable instanceof ColorService)
                    .findFirst()
                    .get()
                    .makeOperation(car, color);
        } catch (CarParameterException e) {
            System.out.println(e.getMessage());
        }
    }

    private void changeWheels(Car car, CarWheels wheels) {

        try {
            services
                    .stream()
                    .filter(serviceable -> serviceable instanceof WheelService)
                    .findFirst()
                    .get()
                    .makeOperation(car, wheels);
        } catch (CarParameterException e) {
            System.out.println(e.getMessage());
        }

    }

    private void addOption(Car car, Options... option) {

        Serviceable service = services
                .stream()
                .filter(serviceable -> serviceable instanceof AddOptionService)
                .findFirst()
                .get();
        Arrays.stream(option).forEach(o -> {
            try {
                service.makeOperation(car, o);
            } catch (CarParameterException e) {
                e.printStackTrace();
            }
        });
    }

    private void deleteOption(Car car, Options... option) {

        Serviceable service = services
                .stream()
                .filter(serviceable -> serviceable instanceof DeleteOptionService)
                .findFirst()
                .get();
        Arrays.stream(option).forEach(o -> {
            try {
                service.makeOperation(car, o);
            } catch (CarParameterException e) {
                e.printStackTrace();
            }
        });
    }

    public void addFactory(Factory factory) {
        factories.add(factory);
    }

    public void removeFactory(Factory factory) {
        factories.remove(factory);
    }


}