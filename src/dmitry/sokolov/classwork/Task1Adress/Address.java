package dmitry.sokolov.classwork.Task1Adress;

public class Address {
    private String city;
    private String country;
    private String street;
    private Integer house;

    public Address(String city, String country, String street, int house) {
        this.city = city;
        this.country = country;
        this.street = street;
        this.house = house;
    }

    public void print() {
        System.out.printf("Country =: %s, city: %s, street: %s, house: %s \n",
                country,
                city,
                street,
                house
        );
    }

    public String getCity() {
        return city;
    }
}
