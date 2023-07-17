package dmitry.sokolov.classwork.CW1707;

public class Box extends AbstractBox implements Printable{
    private final String type;
    public String size = "big";

    public Box(int x, int y, int z) {
        super(x, y, z);
        type = "box";
    }

    @Override
    public void print() {
        System.out.printf("Box{x: %s, y: %s, z: %s, type: %s}", x, y, z, type);
    }
    public void printNameWithPrefix(String pref) {
        System.out.println(pref + name);
    }
    public int getValue() {
        return x * y * z;
    }
    private String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return String.format("Box{x: %s, y: %s, z: %s", x, y, z);
    }
    public String getType() {
        return type;
    }
}
