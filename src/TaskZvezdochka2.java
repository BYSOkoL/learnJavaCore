public class TaskZvezdochka2 {
    public static void main(String[] args) {
        int[] students = new int[] {1, 3, 3, 3, 4, 2};
        int[] rubles = new int[students.length];
        rubles[students.length-1] = 1;
        for (int i = students.length - 2; i >= 1; i--) {
            if ((students[i] > students[i-1]) && (students[i] > students[i+1])){
                rubles[i] = students[i+1] + 1;
                continue;
            } else if ((students[i] > students[i-1]) && (students[i] <= students[i+1])){
                rubles[i] = students[i-1] + 1;
                continue;
            } else if ((students[i] <= students[i-1]) && (students[i] <= students[i+1])){
                rubles[i] = 1;
                continue;
            }
        }
        for (int a:
             rubles) {
            System.out.println(a);

        }
    }
}
