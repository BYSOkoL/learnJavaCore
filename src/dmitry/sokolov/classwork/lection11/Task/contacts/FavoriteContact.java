package dmitry.sokolov.classwork.lection11.Task.contacts;


public class FavoriteContact extends Contact {
    private final int fastCallDigit;

    public FavoriteContact(Contact contact, int fastCallDigit) {
        super(contact);
        this.fastCallDigit = fastCallDigit;
    }

    public int getFastCallDigit() {
        return fastCallDigit;
    }
}
