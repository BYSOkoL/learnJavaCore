package dmitry.sokolov.homework.project.carInfo;


import dmitry.sokolov.homework.project.enums.bmwEnums.BMWTransmission;

public class BMWCarInfo extends CarInfo {

    private final BMWTransmission transmission;

    public BMWCarInfo(BMWTransmission transmission) {
        this.transmission = transmission;
    }

    public BMWTransmission getTransmission() {
        return transmission;
    }
}