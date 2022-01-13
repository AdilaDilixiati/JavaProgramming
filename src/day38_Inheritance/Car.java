package day38_Inheritance;

public class Car {

    public String brand, model, colour;
    public int year, miles;
    public double price;

    public Car(String brand, String model, String colour, int year, int miles, double price) {
        this.brand = brand;
        this.model = model;
        this.colour = colour;
        this.year = year;
        this.miles = miles;
        this.price = price;
    }

    public void start(){
        System.out.println(brand + " " + model + " is starting.");
    }

    public void drive(){
        System.out.println(brand + " " + model + " is driving.");
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", year=" + year +
                ", miles=" + miles +
                ", price=" + price +
                '}';
    }
}

/*
Create a class called Car
			instance variables:
				brand, model, year, price, color, miles
				add a constructor to set all the fields
			instance methods:
				start(), drive(),toString()
 */
