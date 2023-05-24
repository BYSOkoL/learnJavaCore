package dmitry.sokolov.classwork.Task1Adress;

public class Main {
    public static void main(String[] args) {
        Address[] addresses = {
                new Address("Miami", "Usa", "Central ave.", 34567890),
                new Address("Toronto", "Canada", "West road.", 12),
                new Address("Minsk", "Belarus", "Best street", 0)
        };
        for (var address : addresses) {
            address.print();
        }
        var address = findAddressByCity("Minsk", addresses);
        address.print();
    }

    private static Address findAddressByCity(String city, Address[] addresses) {
        for (var address :
                addresses) {
            if (address.getCity().equals(city)) {
                return address;
            }
        }
        return null;
    }
}
