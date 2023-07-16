package dmitry.sokolov.homework.fifth;

import java.util.HashMap;
import java.util.Map;

public class Main {

    private static final Map<RobotParts, Integer> storage = new HashMap<>();

    public static void main(String[] args) throws InterruptedException {

        Factory factory = new Factory(storage);
        Countries countryOne = new Countries("FirstCountry", storage);
        Countries countryTwo = new Countries("SecondCountry", storage);
        Countries countryThree = new Countries("CreativeNameCountry", storage);
        Thread producer = new Thread(factory::produceParts);
        Thread country1 = new Thread(countryOne::createRobots);
        Thread country2 = new Thread(countryTwo::createRobots);
        Thread country3 = new Thread(countryThree::createRobots);
        producer.setDaemon(true);
        producer.start();
        country1.start();
        country2.start();
        country3.start();
        country1.join();
        country2.join();
        country3.join();
    }
}
