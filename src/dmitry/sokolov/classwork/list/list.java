package dmitry.sokolov.classwork.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class list {
    public static void main(String[] args) {
        List<Integer> numbers = new LinkedList<>();
        System.out.println(numbers.size());

        numbers.add(12);
        numbers.add(13);
        System.out.println(numbers.size());
        System.out.println(numbers);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
        for (Integer number:
             numbers) {
            System.out.println(number);
        }

    }
}
