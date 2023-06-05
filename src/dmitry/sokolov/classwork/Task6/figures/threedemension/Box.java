package dmitry.sokolov.classwork.Task6.figures.threedemension;

import dmitry.sokolov.classwork.Task6.figures.interfaces.Angle;
import dmitry.sokolov.classwork.Task6.figures.interfaces.Area;
import dmitry.sokolov.classwork.Task6.figures.interfaces.Rib;

public class Box extends ThreeDimension implements Rib, Angle, Area {
    private final double a;
    private final double b;
    private final double c;

    public Box(double a, double b, double c) {
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
    public int getRib() {
        return 0;
    }

    @Override
    public double getVolume() {
        return 0;
    }
}
