package dmitry.sokolov.homework.project.service;


import dmitry.sokolov.homework.project.cars.Car;
import dmitry.sokolov.homework.project.enums.Options;

public class AddOptionService implements Serviceable<Car, Options> {

    @Override
    public void makeOperation(Car car, Options options) {

        if (car == null
                || options == null) {
            throw new NullPointerException();
        }

        if (!car.getOptions().contains(options)) {
            car.addOption(options);
        }

    }
}