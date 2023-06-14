package dmitry.sokolov.classwork.figures.threedemension;

import dmitry.sokolov.classwork.figures.interfaces.Angle;
import dmitry.sokolov.classwork.figures.interfaces.Area;
import dmitry.sokolov.classwork.figures.interfaces.Rib;

public class Box extends ThreeDimension implements Rib, Angle, Area {
    private final double a;
    private final double b;
    private final double c;

    public Box(String name,double a, double b, double c) {
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
    public int getRib() {
        return 0;
    }

    @Override
    public double getVolume() {
        return 0;
    }
}
