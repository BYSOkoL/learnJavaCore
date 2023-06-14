package dmitry.sokolov.classwork.figures.twodimension;

import dmitry.sokolov.classwork.figures.interfaces.Angle;

public class Triangle extends TwoDimension implements Angle {
    private final double a;
    private final double b;
    private final double c;

    public Triangle(String name, double a, double b, double c) {
        super(name);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public int getAngleCount() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
