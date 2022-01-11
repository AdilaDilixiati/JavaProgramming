package day36_Inheritance.PhoneTask;

public class Iphone extends Phone{

    public void faceTime(long phoneNumber){
        System.out.println(colour+ brand+ model+ " is facetiming from phone number: " + phoneNumber);
    }
    public void faceTime(String email){
        System.out.println(brand + " is facetiming from email: "+ email);
    }

    public String toString() {
        return "Iphone{" +
                "brand='" + brand + '\'' +
                ", size='" + size + '\'' +
                ", colour='" + colour + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
