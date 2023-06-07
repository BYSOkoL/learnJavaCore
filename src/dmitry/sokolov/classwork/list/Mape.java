package dmitry.sokolov.classwork.list;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Mape {
    public static void main(String[] args) {
        Map<Integer, String> example = new HashMap<>();
        example.put(1, "one");
        example.put(2, "two");
        example.put(3, "three");
        for (Map.Entry<Integer, String> entry : example.entrySet()) {
            System.out.println(
                    entry.getKey() + ":" + entry.getValue()
            );
        }
        Iterator<Map.Entry<Integer, String>> iterator;
        iterator = example.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(
                    entry.getKey() + ":" + entry.getValue()
            );
        }
    }
}
