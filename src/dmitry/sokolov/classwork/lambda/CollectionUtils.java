package dmitry.sokolov.classwork.lambda;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CollectionUtils {
    public static final BiPredicate<String, String> IS_CONTAINS = String::contains;
    public static final Comparator<String> STRING_LENGTH_COMPARATOR = Comparator.comparingInt(String::length);

    public static boolean ifCollectionHasWord(Collection<String> collection, String word) {
        return collection
                .stream()
                .anyMatch(s -> IS_CONTAINS.test(s, word));
    }

    public static String longestString(Collection<String> collection) {
        return collection
                .stream()
                .sorted(STRING_LENGTH_COMPARATOR.reversed())
                .limit(1)
                .findFirst()
                .orElseThrow();
    }

    public static String shortestString(Collection<String> collection) {
        return collection
                .stream()
                .sorted(STRING_LENGTH_COMPARATOR)
                .limit(1)
                .findFirst()
                .orElseThrow();
    }

    public static Collection<String> isCollectionContainsStringsMatchExpression(Collection<String> collection, String regex) {
        return collection
                .stream()
                .filter(s -> s.matches(regex))
                .collect(Collectors.toList());
    }

    public static Collection<String> getUniqueWords(Collection<String> collection) {
        return collection
                .stream()
                .flatMap(s -> Arrays.stream(s.split(" ")))
                .collect(Collectors.toList());
    }

}
