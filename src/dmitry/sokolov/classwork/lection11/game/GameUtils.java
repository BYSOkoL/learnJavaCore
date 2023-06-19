package dmitry.sokolov.classwork.lection11.game;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Random;

public class GameUtils {
    private GameUtils() {
    }

    public static void print (String message) {
        System.out.println(message);
    }
    public static int readNumber (BufferedReader reader, String errorMessage) throws IOException {
        while (true) {
            try {
                return Integer.parseInt(reader.readLine());
            } catch (NumberFormatException e) {
                print(errorMessage);
            }
        }
    }
    public static boolean isNumberInRange(int min, int max, int number) {
        return  min <= number && max >= number;
    }
    public static int generateNumberInRange(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
    public static void writeStringToFile(Path pathToFile, String data, String errorMessage) {
        try {
            Files.writeString(pathToFile, data + "\n", StandardOpenOption.APPEND);
        } catch (IOException e) {
            print(errorMessage);
        }
    }
}
