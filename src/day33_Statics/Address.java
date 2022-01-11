package day33_Statics;

public class Address {

    public int streetNumber, zipCode;
    public String street, city, state;
    public static String country = "Canada";
    public static String planet = "Earth";


    public Address(int streetNumber, String street, String city, String state, int zipCode) {
        this.streetNumber = streetNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String toString() {
        return "Address{" +
                "streetNumber=" + streetNumber +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }
}


