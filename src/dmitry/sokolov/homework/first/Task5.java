package dmitry.sokolov.homework.first;

public class Task5 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 0, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {1, 1, 3, 0, 0},
                {1, 4, 4, 4, 0}
        };
        int maxI = 0;
        int maxJ = 0;
        boolean lowerTriangular = true;
        for (int i = 0; i < array.length; i++) {
            maxI = i + 1;
            for (int j = array[i].length-1; j > i; j--) {
                maxJ = j + 1;
                if (array[i][j] != 0) {
                    lowerTriangular = false;
                }
            }
        }
        if (maxI != maxJ) {
            System.out.println("It's not a square");
            return;
        }
        if (lowerTriangular == true) {
            System.out.println("Its lower triangular matrix");
        } else {
            System.out.println("Its NOT lower triangular matrix");
        }
    }
}
