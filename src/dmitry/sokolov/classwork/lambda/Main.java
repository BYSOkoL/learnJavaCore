package dmitry.sokolov.classwork.lambda;

import java.util.Comparator;
import java.util.List;

public class Main {
    //    LambdaExpressions.InnerStatic box = new LambdaExpressions.InnerStatic();
//    LambdaExpressions.BoxPublic box = new LambdaExpressions().new BoxPublic();
    public static void main(String[] args) {
        List<String> strings = List.of(
                "asdas dasd",
                "swap",
                "!@132123",
                "!@13212-3",
                "!@132123"
        );
//    System.out.println(CollectionUtils.ifCollectionHasWord(strings, "swap"));
//    System.out.println(CollectionUtils.longestString(strings));
//    System.out.println(CollectionUtils.shortestString(strings));
        System.out.println(CollectionUtils.isCollectionContainsStringsMatchExpression(strings, "^.* [^, -.]*$"));
        List<String> myList = List.of("a1", "a2", "a3", "b1", "b2", "b3", "c2", "c1", "c5");
        long count = myList
                .stream()
                .filter(s -> !s.contains("3"))
                .sorted(Comparator.comparingInt(o -> o.charAt(1)))
                .sorted((
                    Comparator
                            .<String>comparingInt(o -> o.charAt(0))
                            .reversed()
                ))
                .skip(1)
                .map(String::toUpperCase)
                .peek(System.out::println)
                .count();

        System.out.println();
        System.out.println(count);
    }
}
