package dmitry.sokolov.homework.first;

public class Task5 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 0, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 3, 0},
                {1, 4, 4, 4}
        };
        boolean nizhnTreug = true;
        for (int y = 0; y < array.length; y++) {
            for (int x = array.length - 1; x > y; x--) {
                if (array[y][x] != 0) {
                    nizhnTreug = false;
                    System.out.println("NO");
                    return;
                }
            }
        }
        if (nizhnTreug == true) {
            System.out.println("YES");
        }
    }
}
