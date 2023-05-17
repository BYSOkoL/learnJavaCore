package dmitry.sokolov.homework.first;

public class Task4 {
    public static void main(String[] args) {
        int[][] array = new int[][] {{5,7,-3,-17}, {-7,-3,-1,12}, {8,-1,2,3}};
        int summPolozhit = 0;
        int summOtric = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < 0) {
                    summOtric += 1;
                } else {
                    summPolozhit += 1;
                }
            }
        }
        if (summPolozhit > summOtric) {
            System.out.println("Polozhitel'nih bolshe");
        } else if (summOtric > summPolozhit) {
            System.out.println("Otricatel'nih bolshe");
        } else {
            System.out.println("Porovnu");
        }
    }
}
