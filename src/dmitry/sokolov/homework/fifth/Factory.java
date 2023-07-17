package dmitry.sokolov.homework.fifth;

import java.util.Map;
import java.util.Random;

public class Factory {

    private static final Random RANDOM = new Random();
    private final Map<RobotParts, Integer> StorageForParts;
    public Factory(Map<RobotParts, Integer> robotPartsStorage) {

        this.StorageForParts = robotPartsStorage;
    }
    public void produceParts() {
        try {
            while (true) {
                synchronized (StorageForParts) {
                    RobotParts robotPart = generateModel();
                    Integer numberOfParts = StorageForParts.computeIfAbsent(robotPart, parts -> 0);
                    StorageForParts.put(robotPart, ++numberOfParts);
                    System.out.println("Parts in storage " + StorageForParts);
                    StorageForParts.notify();
                    StorageForParts.wait(500);
                }
            }
        } catch (InterruptedException ignored) {
        }
    }

    private static RobotParts generateModel() {
        return RobotParts.values()[RANDOM.nextInt(RobotParts.values().length)];
    }
}
