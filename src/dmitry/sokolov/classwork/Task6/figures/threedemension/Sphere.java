package dmitry.sokolov.classwork.Task6.figures.threedemension;

public class Sphere extends ThreeDimension {
    private final double r;

    public Sphere(String name, double r) {
        super(name);
        this.r = r;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double getVolume() {
        return 0;
    }
}
