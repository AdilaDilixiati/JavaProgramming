package day36_Inheritance.PhoneTask;

public class Nokia extends Phone{

    public void selfDefense(){
        System.out.println(brand+ " is good for self defense.");
    }

    public String toString() {
        return "Nokia{" +
                "brand='" + brand + '\'' +
                ", size='" + size + '\'' +
                ", colour='" + colour + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
