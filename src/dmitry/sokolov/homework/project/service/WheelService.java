package dmitry.sokolov.homework.project.service;


import dmitry.sokolov.homework.project.cars.Car;
import dmitry.sokolov.homework.project.enums.carInterfaces.CarWheels;
import dmitry.sokolov.homework.project.exceptions.CarParameterException;


public class WheelService implements Serviceable<Car, CarWheels> {

    @Override
    public void makeOperation(Car car, CarWheels e) throws CarParameterException {

        if (car == null
                || e == null) {
            throw new NullPointerException();
        }

        if (!car.getWheelSize().equals(e)) {
            car.setWheelSize(e);
        }
    }

}