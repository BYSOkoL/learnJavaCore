package dmitry.sokolov.classwork.list.withbox;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        List<WithBox> boxes = new ArrayList<>();
        boxes.add(new WithBox(1, 2, 3));
        boxes.add(new WithBox(1, 3, 2));
        boxes.add(new WithBox(1, 20, 3));
        boxes.add(new WithBox(1, 2, 30));

        Map<Integer, List<WithBox>> boxesByVolume = new TreeMap<>();
        for (WithBox box : boxes) {
            int volume = box.volume();
            List<WithBox> boxesFromMap = boxesByVolume.get(volume);
            if (boxesFromMap == null) {
                boxesFromMap = new ArrayList<>();
            }
            boxesFromMap.add(box);
            boxesByVolume.put(volume, boxesFromMap);
        }
        System.out.println(boxesByVolume);
    }
}
