package dmitry.sokolov.homework.project.service;


import dmitry.sokolov.homework.project.cars.Car;
import dmitry.sokolov.homework.project.enums.carInterfaces.CarParameter;
import dmitry.sokolov.homework.project.exceptions.CarParameterException;


public interface Serviceable<T extends Car, V extends CarParameter> {
    void makeOperation(T car, V e) throws CarParameterException;
}