package dmitry.sokolov.classwork.CW0507.tasks;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Task2 {

    public static class SaveAsThread extends Thread {
        private int[] array;
        private String fileName;

        public SaveAsThread(int[] array, String fileName) {
            this.array = array;
            this.fileName = fileName;
        }
        @Override
        public void run() {
            try (var writer = new BufferedWriter(new FileWriter(fileName))) {
                writer.write(Arrays.toString(array));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};
        int[] array3 = {11, 12, 13, 14, 15};
        var thread1 = new SaveAsThread(array1, "PATH_TO_FILE");
        var thread2 = new SaveAsThread(array2, "PATH_TO_FILE");
        var thread3 = new SaveAsThread(array3, "PATH_TO_FILE");
        thread1.start();
        thread2.start();
        thread3.start();
        try {
            thread1.join();
            thread2.join();
            thread3.join();
            System.out.println("Массивы успешно записаны в файлы.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
