package dmitry.sokolov.classwork.Task6.pair;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Pair<String> pair = new Pair<> ("First string", "Second string");
        System.out.println(pair.first());
        System.out.println(pair.second());
        pair.swap();
        pair.replaceFirst("New first");
        System.out.println(pair.first());
        pair.replaceSecond("New second");
        System.out.println(pair.second());
        System.out.println(pair);
    }
}
