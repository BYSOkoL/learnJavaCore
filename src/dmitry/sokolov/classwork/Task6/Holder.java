package dmitry.sokolov.classwork.Task6;

public class Holder<T extends Number> {
    private final T value;
    public Holder(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
