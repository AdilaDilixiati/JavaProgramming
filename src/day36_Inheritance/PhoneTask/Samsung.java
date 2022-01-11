package day36_Inheritance.PhoneTask;

public class Samsung extends Phone{

    public void freeze(){
        System.out.println(brand+ " keeps freezing.");
    }

    public String toString() {
        return "Samsung{" +
                "brand='" + brand + '\'' +
                ", size='" + size + '\'' +
                ", colour='" + colour + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
