package dmitry.sokolov.classwork.Task6;

public class Main {
    public static void main(String[] args) {
        Holder<Integer> intHolder = new Holder<>(12);
        sum(12, intHolder);
    }
    public static void sum(int i, Holder<Integer> holder) {
        System.out.println(i + holder.getValue());
    }
}