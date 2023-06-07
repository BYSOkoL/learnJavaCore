package dmitry.sokolov.classwork.list.withbox;

import java.util.Objects;

public class WithBox {
        private final int x;
        private final int y;
        private final int z;

        public WithBox(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
        public int volume () {
            return x * y * z;
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

        @Override
        public String toString() {
            return "Box{" +
                    "x=" + x +
                    ", y=" + y +
                    ", z=" + z +
                    '}';
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WithBox withBox = (WithBox) o;
        return x == withBox.x && y == withBox.y && z == withBox.z;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }
}


