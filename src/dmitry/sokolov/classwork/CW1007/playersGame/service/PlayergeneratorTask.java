package dmitry.sokolov.classwork.CW1007.playersGame.service;

import dmitry.sokolov.classwork.CW1007.playersGame.Utils;

import static dmitry.sokolov.classwork.CW1007.playersGame.Utils.writePlayersToFile;

public class PlayergeneratorTask extends Thread{

    private final int count;
    private final int min;
    private final int max;
    private final String pathToFile;

    public PlayergeneratorTask(int count, int min, int max, String pathToFile) {
        this.count = count;
        this.min = min;
        this.max = max;
        this.pathToFile = pathToFile;
    }

    @Override
    public void run() {
        var players = Utils.generatePlayers(count, min, max);
        var writeResult = writePlayersToFile(pathToFile, players);

    }
}
