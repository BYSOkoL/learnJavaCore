package dmitry.sokolov.homework.second.Task2;

public class Box1 {
    private final int x;
    private final int y;
    private final int z;

    public Box1(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public int getBoxVolume () {
        return this.x * this.y * this.z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }
    public  String getBoxType () {
        if (z == 0) {
            return String.valueOf(BoxType.LETTER);
        } else if (z == x && z == y) {
            return String.valueOf(BoxType.CUBE);
        } else {
            return String.valueOf(BoxType.USUALBOX);
        }

    }
}

