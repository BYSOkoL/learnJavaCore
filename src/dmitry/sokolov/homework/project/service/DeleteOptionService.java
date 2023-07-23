package dmitry.sokolov.homework.project.service;


import dmitry.sokolov.homework.project.cars.Car;
import dmitry.sokolov.homework.project.enums.Options;

public class DeleteOptionService implements Serviceable<Car, Options> {

    @Override
    public void makeOperation(Car car, Options option) {

        if (car == null
                || option == null) {
            throw new NullPointerException();
        }

        if (car.getOptions().contains(option)) {
            car.removeOption((Options) option);
        }
    }
}