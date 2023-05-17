public class Task6 {
    public static void main(String[] args) {
        int[][] array1 = {
                {31, 32, 30, 540},
                {13, 42, 20, 60},
                {15, 1, 32, 0},
                {11, 4, 4, 4}
        };
        int[][] array2 = {
                {1, 43, 56, 9},
                {1, 2, 36, 3},
                {1, 1, 3, 4},
                {1, 4, 4, 4}
        };
        int[][] summArray = new int[array1.length][array2[0].length];
        for (int i = 0; i < array1.length; i++) {

            for (int j = 0; j < array2[0].length; j++) {

                summArray[i][j] = array1[i][j] + array2[i][j];
                System.out.print(summArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}