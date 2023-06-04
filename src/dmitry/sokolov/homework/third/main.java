package dmitry.sokolov.homework.third;

import dmitry.sokolov.homework.third.enums.*;
import dmitry.sokolov.homework.third.*;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        Service service = new Service();
        service.addOption(Options.ESP);
        service.addOption(Options.ABS);
        service.deleteOption(Options.ABS);

    }
}
