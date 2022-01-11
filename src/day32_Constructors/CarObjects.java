package day32_Constructors;

public class CarObjects {

    public static void main(String[] args) {

        Car car1 = new Car("Toyota");

        Car car2 = new Car("Mercedes","GLE");

        Car car3 = new Car("Tesla", "Model X", 2022);

        Car car4 = new Car("Lexus", "RX350", 2022, 45000);

        Car car5 = new Car("Audi", "A7", 2022, 75000, "white");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
    }
}
