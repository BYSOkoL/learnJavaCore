package dmitry.sokolov.homework.second.Task4;

public class Car {
    private Colors color;
    private String marc;

    public Colors getColor() {
        return color;
    }

    public Car(Colors color, Marcs marc) {
        this.color = color;
        this.marc = String.valueOf(marc);
    }

    public void changeColor(String color) {
        if (marc.equals("AUDI") && (color.equals("BLUE") || color.equals("RED") || color.equals("GREEN"))) {
            this.color = Colors.valueOf(color);
        } else if (marc.equals("BMW") && (color.equals("ORANGE") || color.equals("BLACK") || color.equals("VIOLET"))) {
            this.color = Colors.valueOf(color);
        } else if (marc.equals("KIA") && (color.equals("YELLOW") || color.equals("GRAY") || color.equals("WHITE"))) {
            this.color = Colors.valueOf(color);
        }
    }
}
