package dmitry.sokolov.classwork.Task6.Food.models;

import dmitry.sokolov.classwork.Task6.Food.type.FoodType;

public abstract class Food {
    private String name;

    public Food(String name) {
        this.name = name;
    }
    public abstract FoodType[] getFoodType();
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
