package dmitry.sokolov.classwork.list;

import java.util.LinkedList;

public class List1 {
    public static void main(String[] args) {
        java.util.List<Integer> numbers = new LinkedList<>();
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
