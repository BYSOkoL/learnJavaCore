package dmitry.sokolov.classwork.Task6.Food;

import dmitry.sokolov.classwork.Task6.Food.models.*;
import dmitry.sokolov.classwork.Task6.Food.type.*;
import dmitry.sokolov.classwork.Task6.Food.utils.FoodUtils;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza(
                "Four seasons",
                new FoodType[]{FoodType.FISH, FoodType.MEAT}
        );
        Pasta pasta = new Pasta(
                "Carbonara",
                new FoodType[]{FoodType.FRUIT, FoodType.MILK, FoodType.VEGETABLE}
        );
        Steak steak = new Steak(
                "Steak",
                FoodType.UNKNOWN
        );
        Food[] food = {pizza, pasta, steak};
        Boolean result = FoodUtils.isVegetarian(food);
        System.out.println("result = " + result);
    }
}
