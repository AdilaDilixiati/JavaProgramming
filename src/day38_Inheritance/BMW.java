package day38_Inheritance;

public class BMW extends Car{

    public BMW(String model, String colour, int year, int miles, double price) {
        super("BMW", model, colour, year, miles, price);
    }

    public void breaksDown(){
        System.out.println(brand +" "+ model+ " breaks down every 100 miles.");
    }

    public void racing(){
        System.out.println(brand+" "+ model+ " is racing.");
    }
}
