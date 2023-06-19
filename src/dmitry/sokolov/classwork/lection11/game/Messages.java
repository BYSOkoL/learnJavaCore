package dmitry.sokolov.classwork.lection11.game;

public interface Messages {
    String MAX_NUMBER_LESS_OR_EQUAL_MIN_NUMBER = "Max number %s less or equal min number %s";
    String WELCOME_MESSAGE = "Game started, find a secret number " + " between %s and %s. \nEnter your name: ";
    String NUMBER_INCORRECT_MESSAGE = "Enter number in range from %s to %s.";
    String WIN_MESSAGE = "You WIN! used steps count: %s";
    String SECRET_NUMBER_BIGGER = "Secret number bigger than number";
    String SECRET_NUMBER_LESS = "Secret number less than number";
    String ERROR_MESSAGE = "Something went wrong, pls restart the game";
    String FAIL_TO_WRITE_RESULT = "Write result ERROR";
}
