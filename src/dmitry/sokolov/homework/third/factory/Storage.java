package dmitry.sokolov.homework.third.factory;
import dmitry.sokolov.homework.third.*;
import dmitry.sokolov.homework.third.enums.Option;

public class Storage {
  public Car[] storage;

    public Storage(Car[] storage) {
        this.storage = storage;
    }

    public Car[] getStorage() {
        return storage;
    }

    public void setStorage(Car[] storage) {
        this.storage = storage;
    }

    public void addToStorage(Car car) {
        Car[] newStorage = new Car[storage.length + 1];
        for (var i = 0; i < newStorage.length; i++) {
            if (i < storage.length) {
                newStorage[i] = storage[i];
            }else if (newStorage[i] == null) {
                newStorage[i] = car;
                storage = newStorage;
                break;
            }
        }
    }
    public void deleteFromStorage (Car car) {
            for (Car seekCar :
                    storage) {
                if (seekCar == car) {
                    Car[] newStorage = new Car[storage.length - 1];
                    int j = 0;
                    for (var i = 0; i < storage.length; i++) {
                        if (storage[i] != car) {
                            newStorage[j] = storage[i];
                            j++;
                        }
                    }
                    storage = newStorage;
                } else {
                    System.out.println("Car not available");
                    break;
                }
            }
        }
}
