package dmitry.sokolov.classwork.Task6.figures.twodimension;

import dmitry.sokolov.classwork.Task6.figures.interfaces.Angle;
import dmitry.sokolov.classwork.Task6.figures.interfaces.Area;
import dmitry.sokolov.classwork.Task6.figures.interfaces.Rib;

public class Rectangle extends TwoDimension implements Angle {
    private final double a;
    private final double b;

    public Rectangle(String name, double a, double b) {
        super(name);
        this.a = a;
        this.b = b;

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
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
