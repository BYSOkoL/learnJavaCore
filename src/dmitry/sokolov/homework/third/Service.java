package dmitry.sokolov.homework.third;

import dmitry.sokolov.homework.third.enums.Color;
import dmitry.sokolov.homework.third.enums.Option;
import dmitry.sokolov.homework.third.enums.WheelSize;

public class Service {
    public void changeColor(Car car, Color color) {
        if ((car != null && color != null) && (car.color != color)) {
            car.setColor(color);
        }
    }
    public void changeWheelSize(Car car, WheelSize wheelSize) {
        if ((car != null && wheelSize != null) && (car.wheelSize != wheelSize)) {
            car.setWheelSize(wheelSize);
        }
    }
    public void addOption(Car car, Option option) {
        Option[] newOptions = new Option[car.options.length + 1];
        for (var i = 0; i < newOptions.length; i++) {

            if (i < car.options.length) {
                if (car.options[i] == option) {
                    System.out.println("Car has this option already");
                    break;
                }
                newOptions[i] = car.options[i];
            }else if (newOptions[i] == null) {
                newOptions[i] = option;
                car.options = newOptions;
                break;
            }
        }

    }
    public void deleteOption(Car car, Option option) {
        for (Option seekOption :
                car.options) {
            if (seekOption == option) {
                Option[] newOptions = new Option[car.options.length - 1];
                int j = 0;
                for (var i = 0; i < car.options.length; i++) {
                    if (car.options[i] != option) {
                        newOptions[j] = car.options[i];
                        j++;
                    }
                }
                car.options = newOptions;
            } else {
                System.out.println("Option not available");
                break;
            }
        }
    }

    public void setOptions (Car car, Option[] options){
        car.options = options;
    }
}






