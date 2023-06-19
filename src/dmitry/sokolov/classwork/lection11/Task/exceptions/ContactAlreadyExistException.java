package roman.lis.phone.exceptions;

public class ContactAlreadyExistException extends RuntimeException {
    public ContactAlreadyExistException(String message) {
        super(message);
    }
}
