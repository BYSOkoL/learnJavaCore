public class Task5 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 0, 0, 0},
                {1, 2, 0, 0},
                {1, 1, 3, 0},
                {1, 4, 4, 4}
        };
        boolean proverka = true;

        for (int y = 0; y < array.length; y++) {
            for (int x = array.length - 1; x > y; x--) {
                if (array[y][x] != 0) {
                    proverka = false;
                    System.out.println("NO");
                    return;
                }
            }
        }
        if (proverka == true) {
            System.out.println("YES");
        }

    }
}
