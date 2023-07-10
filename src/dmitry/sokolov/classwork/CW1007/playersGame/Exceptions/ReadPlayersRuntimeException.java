package dmitry.sokolov.classwork.CW1007.playersGame.Exceptions;

public class ReadPlayersRuntimeException extends RuntimeException{
    public ReadPlayersRuntimeException(String message) {
        super(message);
    }

    public ReadPlayersRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }
}
