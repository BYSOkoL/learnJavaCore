package dmitry.sokolov.classwork.figures.threedemension;

import dmitry.sokolov.classwork.figures.interfaces.Angle;
import dmitry.sokolov.classwork.figures.interfaces.Area;
import dmitry.sokolov.classwork.figures.interfaces.Rib;

public class Pyramid extends ThreeDimension implements Rib, Angle, Area {
    private final double a;
    private final double b;
    private final double c;
    private final double h;

    public Pyramid(String name, double a, double b, double c, double h) {
        super(name);
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
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
