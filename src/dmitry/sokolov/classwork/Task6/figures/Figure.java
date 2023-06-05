package dmitry.sokolov.classwork.Task6.figures;

public abstract class Figure {
    private final String name;
    public Figure(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
