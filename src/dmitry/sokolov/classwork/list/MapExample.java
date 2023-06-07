package dmitry.sokolov.classwork.list;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        String data = "I love java in it academy";
        Map<Character, Integer> mapCharacterCount = new HashMap<>();
        for (Character c : data.toCharArray()) {
            if (mapCharacterCount.containsKey(c)) {
                int currentCount = mapCharacterCount.get(c);
                mapCharacterCount.replace(c, ++currentCount);
            } else {
                mapCharacterCount.put(c, 1);
            }
        }
        System.out.println(mapCharacterCount);
    }
}
