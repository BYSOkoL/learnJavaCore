package dmitry.sokolov.homework.project.carInfo;

import dmitry.sokolov.homework.project.enums.audiEnums.AudiCarType;

public class AudiCarInfo extends CarInfo {

    private final AudiCarType audiCarType;

    public AudiCarInfo(AudiCarType audiCarType) {
        this.audiCarType = audiCarType;
    }

    public AudiCarType getAudiCarType() {
        return audiCarType;
    }
}