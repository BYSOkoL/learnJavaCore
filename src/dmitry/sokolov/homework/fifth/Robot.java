package dmitry.sokolov.homework.fifth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Robot {

    private final List<RobotParts> PartsForRobot= new ArrayList<>();

    public Robot() {
        PartsForRobot.addAll(Arrays.asList(RobotParts.values()));
    }

    public List<RobotParts> getPartsForRobot() {
        return PartsForRobot;
    }

    @Override
    public String toString() {
        return  PartsForRobot.toString();
    }
}
