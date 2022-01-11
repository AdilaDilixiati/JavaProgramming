package day36_Inheritance.PhoneTask;

public class Phone {

    public String brand, size, colour, model;
    public double price;

    public void setInfo(String brand, String size, String colour, String model, double price) {
        this.brand = brand;
        this.size = size;
        this.colour = colour;
        this.model = model;
        this.price = price;
    }

    public void call(long phoneNumber){
        System.out.println(brand+ " is calling from " + phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println(brand+ " is texting from " + phoneNumber);
    }

    public String toString() {
        return "PhoneTask{" +
                "brand='" + brand + '\'' +
                ", size='" + size + '\'' +
                ", colour='" + colour + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}


/*
Phone Task:
		1.1 Create a class named Phone:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					toString()

		1.2 Create a sub class of Phone named IPhone:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					faceTime(long phoneNumber)
					faceTime(String email)
					toString()

		1.3 Create a sub class of Phone named Samsung:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					freeze()
					toString()

		1.4 Create a sub class of Phone named Nokia:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					selfDefense()
					toString()

		1.5 Create a class named Phone Objects and test of the sub class' objects


 */
