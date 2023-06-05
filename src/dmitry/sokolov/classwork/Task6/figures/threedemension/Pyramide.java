package dmitry.sokolov.classwork.Task6.figures.threedemension;

import dmitry.sokolov.classwork.Task6.figures.interfaces.Angle;
import dmitry.sokolov.classwork.Task6.figures.interfaces.Area;
import dmitry.sokolov.classwork.Task6.figures.interfaces.Rib;

public class Pyramide extends ThreeDimension implements Rib, Angle, Area {
    private final double a;
    private final double b;
    private final double c;
    private final double h;

    public Pyramide(double a, double b, double c, double h) {
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
