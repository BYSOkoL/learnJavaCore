package dmitry.sokolov.classwork.Task6.pair;

public class Pair<T> {
    private T first;
    private T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }
    public T first() {
        return first;
    }
    public T second() {
        return second;
    }
    public void swap() {
        T temp = first;
        first = second;
        second = temp;
    }
    public void replaceFirst (T value) {
        first = value;
    }
    public void replaceSecond (T value) {
        second = value;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
