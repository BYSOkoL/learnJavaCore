import java.util.Arrays;

public class Les {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 10, 7, 8, 9};
        int max = array[0];
        int min = array[0];
        int indexMax = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                indexMax = i;
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        array[indexMax] = max * min;
    }
}
