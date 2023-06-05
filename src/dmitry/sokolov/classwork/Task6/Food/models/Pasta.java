package dmitry.sokolov.classwork.Task6.Food.models;

import dmitry.sokolov.classwork.Task6.Food.type.FoodType;

public class Pasta extends Food{
    private final FoodType[] foodTypes;

    public Pasta(String name, FoodType[] foodTypes) {
        super(name);
        this.foodTypes = foodTypes;
    }

    @Override
    public FoodType[] getFoodType() {
        return foodTypes;
    }
}
