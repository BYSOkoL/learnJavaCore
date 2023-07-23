package dmitry.sokolov.homework.project.service;

import dmitry.sokolov.homework.project.cars.Car;
import dmitry.sokolov.homework.project.enums.carInterfaces.CarColors;
import dmitry.sokolov.homework.project.exceptions.CarParameterException;


public class ColorService implements Serviceable<Car, CarColors> {

    @Override
    public void makeOperation(Car car, CarColors color) throws CarParameterException {

        if (car == null
                || color == null) {
            throw new NullPointerException();
        }

        if (!car.getColor().equals(color)) {
            car.setColor(color);
        }
    }
}