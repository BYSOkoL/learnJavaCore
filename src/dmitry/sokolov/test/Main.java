package dmitry.sokolov.test;

import dmitry.sokolov.test.Box;

public class Main {
    public static void main(String[] args) {
        Box [] boxes = {
                new Box(1, 2, 3)
                new Box(1, 2, 3)
                new Box(1, 2, 3)
                new Box(1, 2, 3)
        };
        int maxVolume = 0;
        for (Box box:
             boxes) {
            int currentVolume = box.getBoxVolume();
            if (currentVolume > maxVolume) {
                maxVolume = currentVolume;
            }
        }
        System.out.println(maxVolume);
    }
}
