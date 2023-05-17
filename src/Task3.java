public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 4, 5, 6, -2, 13} ;
        int[] invertArray = new int[array.length];
        int i = array.length-1;
        for (; i >= 0; i--) {
            for (int j = 0; j < array.length; j++) {
                invertArray[j] = array[i];
            }
        }

    }
}
