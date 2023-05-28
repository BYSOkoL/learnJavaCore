package dmitry.sokolov.homework.second.Task4;

public class Car {
    private Colors color;
    private String brand;

    public Colors getColor() {
        return color;
    }

    public Car(Colors color, Brand brand) {
        this.color = color;
        this.brand = String.valueOf(brand);
    }

    public void changeColor(String color) {
        if (brand.equals("AUDI") && (color.equals("BLUE") || color.equals("RED") || color.equals("GREEN"))) {
            this.color = Colors.valueOf(color);
        } else if (brand.equals("BMW") && (color.equals("ORANGE") || color.equals("BLACK") || color.equals("VIOLET"))) {
            this.color = Colors.valueOf(color);
        } else if (brand.equals("KIA") && (color.equals("YELLOW") || color.equals("GRAY") || color.equals("WHITE"))) {
            this.color = Colors.valueOf(color);
        }
    }
}
