public class TaskZvesdochka1 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 1, 1, 1};
        int summ1 = 0;
        int summ2 = 0;
        for (int i = 1; i < array.length; i += 2) {
            summ1 += array[i];
        }
        for (int i = 0; i < array.length; i += 2) {
            summ2 += array[i];
        }
        if (summ1 < summ2) {
            System.out.println(summ2);
        } else if (summ1 > summ2) {
            System.out.println(summ1);
        } else {
            System.out.println("summ1 = summ2 = " + summ1);
        }
    }
}
