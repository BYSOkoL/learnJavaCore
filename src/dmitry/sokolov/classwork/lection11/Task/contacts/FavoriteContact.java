package roman.lis.phone.contacts;

public class FavoriteContact extends Contact {
    private final int fastCallDigit;

    public FavoriteContact(String name, int fastCallDigit) {
        super(name);
        this.fastCallDigit = fastCallDigit;
    }

    public int getFastCallDigit() {
        return fastCallDigit;
    }
}
