package dmitry.sokolov.classwork.CW1707;

public abstract class AbstractBox {
    protected final int x;
    protected final int y;
    protected final int z;

    public final String name = "BOX";

    public AbstractBox(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}
