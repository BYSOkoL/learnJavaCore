package dmitry.sokolov.classwork.Task6.Food.type;

public enum FoodType {
    MEAT(false),
    FISH(false),
    FRUIT(true),
    VEGETABLE(true),
    MILK(true),
    UNKNOWN(null);

    private Boolean vegan;

    FoodType(Boolean vegan) {
        this.vegan = vegan;
    }

    public Boolean getVegan() {
        return vegan;
    }
}
