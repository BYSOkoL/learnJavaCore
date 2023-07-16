package dmitry.sokolov.homework.fifth;
import java.util.Iterator;
import java.util.Map;

public class Countries {

    private static volatile boolean end;
    private final String countryName;
    private int robotsCount;
    private final Map<RobotParts, Integer> factory;

    public Countries(String countryName, Map<RobotParts, Integer> factory) {
        this.countryName = countryName;
        this.factory = factory;
    }

    public void createRobots() {
        Robot robot = new Robot();
        try {
            while (!end) {
                synchronized (factory) {
                    Iterator<RobotParts> iteratorOfParts = robot.getPartsForRobot().iterator();
                    while (iteratorOfParts.hasNext()) {
                        RobotParts part = iteratorOfParts.next();
                        Integer partsNumber = factory.get(part);
                        if (partsNumber != null && partsNumber > 0) {
                            iteratorOfParts.remove();
                            factory.put(part, partsNumber - 1);
                        }
                    }
                    if (robot.getPartsForRobot().isEmpty()) {
                        robotsCount++;
                        if (robotsCount == 20) {
                            System.out.println( "Winner - " + countryName + "! Congratulation!" );
                            end = true;
                            factory.notifyAll();
                            break;
                        } else {
                            robot = new Robot();
                        }
                    }
                    System.out.println(countryName + " - " + robotsCount + " robots, needs parts for new robot " + robot);
                    factory.wait();
                }
            }
        } catch (InterruptedException ignored) {
        }
    }

}