package dmitry.sokolov.classwork.lection11.game;

public class Main {
    private static final String PATH = "C:\\Users\\User\\Documents\\GitHub\\learnJavaCore\\src\\dmitry\\sokolov\\classwork\\lection11\\game\\result";
    public static void main(String[] args) {
        Game game = new Game(1, 100, PATH);
        game.start();
    }
}
