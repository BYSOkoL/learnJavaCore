package dmitry.sokolov.classwork.carsClass;

import java.util.Random;

public enum CarModel {
    MODEL_X,
    MODEL_Y,
    MODEL_Z;
private static final CarModel[] MODELS = CarModel.values();
    public static CarModel getRandomModel(Random random){
        return MODELS[random.nextInt(MODELS.length)];
    }
}
