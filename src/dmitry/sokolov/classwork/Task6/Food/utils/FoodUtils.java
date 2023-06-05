package dmitry.sokolov.classwork.Task6.Food.utils;
import dmitry.sokolov.classwork.Task6.Food.models.*;
import dmitry.sokolov.classwork.Task6.Food.type.*;

public class FoodUtils {
    private FoodUtils() {

    }
    public static boolean isVegetarian (Food[] foods) {
        for (Food food:
             foods) {
            for (FoodType type:
                 food.getFoodType()) {
                if (type.getVegan() == null || !type.getVegan()) {
                    return false;
                }
            }
        }
        return true;
    }
}
