package dmitry.sokolov.homework.second.Task4;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(Colors.GREEN, Brand.AUDI);
        car.changeColor(String.valueOf(Colors.RED));
        System.out.println(car.getColor());
    }
}
