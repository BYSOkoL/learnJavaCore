package dmitry.sokolov.classwork.Task6.Food.models;

import dmitry.sokolov.classwork.Task6.Food.type.FoodType;

public class Pizza extends Food {
    private final FoodType[] foodTypes;

    public Pizza(String name, FoodType[] foodTypes) {
        super(name);
        this.foodTypes = foodTypes;
    }

    @Override
    public FoodType[] getFoodType() {
        return foodTypes;
    }
}
