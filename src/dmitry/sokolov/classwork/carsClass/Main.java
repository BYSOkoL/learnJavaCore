package dmitry.sokolov.classwork.carsClass;

public class Main {
    public static void main(String[] args) {
        System.out.println(
                CarUtils.groupByEngineCapacity(
                  CarUtils.generateCars(10)
                )
        );


    }
}
