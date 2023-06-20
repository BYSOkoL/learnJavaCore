package dmitry.sokolov.homework.fourth;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = in.nextInt();
        System.out.println("Enter m: ");
        int m = in.nextInt();

        int[][] array1 = new int[n][m];
        System.out.println("Enter the elements of the first array: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array1[i][j] = in.nextInt();
            }
        }
        int[][] array2 = new int[n][m];
        System.out.println("Enter the elements of the second array: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array2[i][j] = in.nextInt();
            }
        }
        System.out.println("First array: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Second array: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Sum of matrix: ");
        int[][] sum = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum[i][j] = array1[i][j] + array2[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matrix difference: ");
        int[][] diff = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                diff[i][j] = array1[i][j] + (array2[i][j] * (-1));
                System.out.print(diff[i][j] + " ");
            }
            System.out.println();
        }
    }
}
