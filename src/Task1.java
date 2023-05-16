public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*100);
        }
        int ignoreNumber = array[4];
        int summArray = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != ignoreNumber) {
                summArray += array[i];
            } else {
                continue;
            }
        }
        System.out.println(summArray);
    }
}
