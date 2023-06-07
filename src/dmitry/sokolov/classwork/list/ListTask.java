package dmitry.sokolov.classwork.list;

import java.util.*;
import java.util.List;

public class ListTask {
    public static void main(String[] args) {
//        List1<Integer> numbers = new ArrayList<>();
//        numbers.add(12);
//        numbers.add(22);
//        numbers.add(32);
//        Integer minInt = numbers.get(0);
//        for (Integer number :
//                numbers) {
//            if (number < minInt) {
//                minInt = number;
//            }
//        }
//        System.out.println(minInt);


        List<Integer> example = new ArrayList<>();
        example.add(1);
        example.add(-100);
        example.add(15);
        example.add(32);
        ListIterator<Integer> iterator = example.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next() == 15) {
                iterator.remove();
                if (iterator.hasPrevious()) {
                    System.out.println(iterator.previous());
                }
            }
        }
        System.out.println(example);
    }
}
