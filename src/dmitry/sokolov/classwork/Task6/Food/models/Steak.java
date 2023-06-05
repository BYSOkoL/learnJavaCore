package dmitry.sokolov.classwork.Task6.Food.models;

import dmitry.sokolov.classwork.Task6.Food.type.FoodType;

public class Steak extends Food {
    private final FoodType foodType;

    public Steak(String name, FoodType foodType) {
        super(name);
        this.foodType = foodType;
    }

    @Override
    public FoodType[] getFoodType() {
        return new FoodType[] {foodType};
    }
}
