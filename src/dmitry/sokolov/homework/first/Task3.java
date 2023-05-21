package dmitry.sokolov.homework.first;

public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int temp = 0;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
            System.out.print(array[i] + " ");
        }
        for (int i = (array.length - 1) / 2; i >= 0; i--) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
            System.out.print(array[i] + " ");
        }
    }
}
