package dmitry.sokolov.classwork.lection11;

import java.io.Serializable;

public class Box implements Serializable {
    public final int x;
    public final int y;
    public final int z;
    private transient String name;

    public Box(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Box{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;

    }
}
