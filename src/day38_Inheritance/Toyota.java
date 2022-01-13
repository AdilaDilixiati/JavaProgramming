package day38_Inheritance;

public class Toyota extends Car{

    public Toyota(String model, String colour, int year, int miles, double price) {
        super("Toyota", model, colour, year, miles, price);
    }

    public void reliable(){
        System.out.println(brand+ " "+ model + " is reliable.");
    }

}
