package dmitry.sokolov.classwork.lection11.game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;
import java.util.Scanner;

import static dmitry.sokolov.classwork.lection11.game.GameUtils.*;
import static dmitry.sokolov.classwork.lection11.game.Messages.*;
import static java.lang.String.format;

public class Game {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    private int stepCount;
    private String name;
    private int secretNumber;

    private final int minNumber;
    private final int maxNumber;
    private final Path pathToFile;

    public Game(int minNumber, int maxNumber, String pathToFile) {
        if (maxNumber <= minNumber) {
            throw new IllegalArgumentException(
                    format(
                            MAX_NUMBER_LESS_OR_EQUAL_MIN_NUMBER,
                            minNumber,
                            maxNumber
                    )
            );
        }
        this.minNumber = minNumber;
        this.maxNumber = maxNumber;
        this.pathToFile = Paths.get(pathToFile);
    }

    public void start() {
        print(format(
                WELCOME_MESSAGE,
                minNumber,
                maxNumber
        ));
        secretNumber = generateNumberInRange(minNumber, maxNumber);
        try {
            name = READER.readLine();
            game();
            writeStringToFile(pathToFile, "User " + name + " used steps " + stepCount, FAIL_TO_WRITE_RESULT);
        } catch (IOException e) {
            print(ERROR_MESSAGE);
        }
    }

    private void game() throws IOException {
        print(format(NUMBER_INCORRECT_MESSAGE,
                minNumber,
                maxNumber));
        while (true) {
            int userNumber = readNumber(READER,
                    format(NUMBER_INCORRECT_MESSAGE,
                            minNumber,
                            maxNumber)
            );
            if (!isNumberInRange(minNumber, maxNumber, userNumber)) {
                print(format(NUMBER_INCORRECT_MESSAGE,
                        minNumber,
                        maxNumber));
                continue;
            }
            stepCount++;
            if (userNumber == secretNumber) {
                print(format(
                        WIN_MESSAGE,
                        stepCount
                ));
                break;
            }
            showTooltip(userNumber);
        }
    }

    private void showTooltip(int userNumber) {
        if (userNumber > secretNumber) {
            print(SECRET_NUMBER_LESS);
        } else {
            print(SECRET_NUMBER_BIGGER);
        }
    }
}
