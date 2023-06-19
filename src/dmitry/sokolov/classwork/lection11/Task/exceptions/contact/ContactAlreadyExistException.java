package dmitry.sokolov.classwork.lection11.Task.exceptions.contact;


public class ContactAlreadyExistException extends RuntimeException {
    public ContactAlreadyExistException(String message) {
        super(message);
    }
}
