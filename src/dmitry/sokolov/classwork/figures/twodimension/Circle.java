package dmitry.sokolov.classwork.figures.twodimension;

public class Circle extends TwoDimension {
    private final double r;

    public Circle(String name, double r) {
        super(name);
        this.r = r;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }
}
