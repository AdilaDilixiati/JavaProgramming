package day38_Inheritance;

public class Tesla extends Car{

    public Tesla(String model, String colour, int year, int miles, double price) {
        super("Tesla", model, colour, year, miles, price);
    }

    public void autoPilot(){
        System.out.println(brand+" "+ model+ " in autopilot mode.");
    }
}
