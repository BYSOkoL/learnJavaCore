package dmitry.sokolov.homework.first;

public class Task4 {
    public static void main(String[] args) {
        int[][] array = new int[][]{{5, 7, -3, -17}, {-7, -3, -1, 12}, {8, -1, 2, 3}};
        int summPositive = 0;
        int summNegative = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < 0) {
                    summNegative += 1;
                } else {
                    summPositive += 1;
                }
            }
        }
        if (summPositive > summNegative) {
            System.out.println("More positive");
        } else if (summNegative > summPositive) {
            System.out.println("More negative");
        } else {
            System.out.println("Equals");
        }
    }
}
