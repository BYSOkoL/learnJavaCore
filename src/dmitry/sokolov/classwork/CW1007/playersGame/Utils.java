package dmitry.sokolov.classwork.CW1007.playersGame;

import dmitry.sokolov.classwork.CW1007.playersGame.Exceptions.ReadPlayersRuntimeException;
import dmitry.sokolov.classwork.CW1007.playersGame.model.Player;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Utils {
    private static final Random RANDOM = new Random();
    private static final String[] NAMES = {
            "Kate",
            "Max",
            "John",
            "Alex",
            "Jessica"
    };

    private Utils() {
    }

    public static List<Player> generatePlayers(int count, int min, int max) {
        var players = new ArrayList<Player>();
        for (int i = 0; i < count; i++) {
            players.add(generatePlayer(min, max));
        }
        return players;
    }

    private static Player generatePlayer(int min, int max) {
        return new Player(
                generateName(),
                generateAge(min, max),
                generateActive()
        );
    }

    public static boolean writePlayersToFile(String pathToFile,
                                             List<Player> players) {
        try (var oos = new ObjectOutputStream(new FileOutputStream(pathToFile))) {
            oos.writeObject(players);
            return true;
        } catch (Exception e) {
            System.err.println("Error");
            return false;
        }
    }
    public static List<Player> readFromFile(String pathToFile) {
        try(
        var ois = new ObjectInputStream(new FileInputStream(pathToFile))) {
            Object o = ois.readObject();
            if (o instanceof List<?>) {
                return (List<Player>) o;
            } else {
               throw new ReadPlayersRuntimeException("File do not have correct List of players");
            }
        } catch (Exception e) {
            throw new ReadPlayersRuntimeException("error", e);
        }
    }


    private static int generateAge(int min, int max) {
        return RANDOM.nextInt(min, max);
    }

    private static boolean generateActive() {
        return RANDOM.nextBoolean();
    }

    private static String generateName() {
        return NAMES[RANDOM.nextInt(NAMES.length)];
    }

}
