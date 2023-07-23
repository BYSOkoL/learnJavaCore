package dmitry.sokolov.homework.project.carInfo;

import dmitry.sokolov.homework.project.enums.fordEnums.FordFuelType;

public class FordCarInfo extends CarInfo {

    private final FordFuelType fuelType;

    public FordCarInfo(FordFuelType fuelType) {
        this.fuelType = fuelType;
    }

    public FordFuelType getFuelType() {
        return fuelType;
    }
}