package dmitry.sokolov.classwork.carsClass;

import dmitry.sokolov.homework.third.enums.EngineVolume;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class CarUtils {
    private static final Random RANDOM = new Random();
    public static List<Car> generateCars(int n) {
        List<Car> result = new ArrayList<>();
        for (int i = 0; i < n; i++)  {
            result.add(new Car( "" + i, CarModel.getRandomModel(RANDOM), RANDOM.nextInt(3) + 1));
        }
        return result;
    }
    public static Map<Integer, List<Car>> groupByEngineCapacity(List<Car> cars) {
        Map<Integer, List<Car>> result = new HashMap<>();
        for (var car : cars) {
            var listWithCars = result.getOrDefault(
                    car.getEngineCapacity(),
                    new ArrayList<>()
            );
            listWithCars.add(car);
            result.put(car.getEngineCapacity(), listWithCars);
        }
        return result;
    }

//    public static void writeToFileWithCapacity (Map<Integer, List<Car>> cars, int engineVolume) {
//
////        try (BufferedWriter buffWriter = new BufferedWriter(new FileWriter("C:\\Users\\User\\Documents\\GitHub\\learnJavaCore\\src\\dmitry\\sokolov\\classwork\\carsClass\\FILE"))) {
////        } catch (IOException e) {
////            e.printStackTrace();
////            e.printStackTrace();
////        }
//    }
}
