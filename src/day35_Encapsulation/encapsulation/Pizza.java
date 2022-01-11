package day35_Encapsulation.encapsulation;

import java.rmi.ServerError;

public class Pizza {

    private String size;
    private int numberOfCheeseTopping, numberOfPepperoniTopping;

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping){
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfCheeseTopping(numberOfPepperoniTopping);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (size != "small" || size != "medium" || size !="large" ){
            System.err.println("Enter valid size");
            System.exit(0);
        }
        this.size = size;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        if (size == "small" && numberOfCheeseTopping <0 && numberOfCheeseTopping >3){
            System.err.println("Invalid entry");
            System.exit(0);
        }
        if (size == "medium" && numberOfCheeseTopping <0 && numberOfCheeseTopping >4) {
            System.err.println("Invalid entry");
            System.exit(0);
        }
        if(size == "large" && numberOfCheeseTopping <0 && numberOfCheeseTopping>5){
            System.err.println("Invalid entry");
            System.exit(0);
        }
        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
        if(size == "small" && numberOfPepperoniTopping <0 && numberOfPepperoniTopping>4){
            System.err.println("Invalid entry");
            System.exit(0);
        }
        if(size == "medium" && numberOfPepperoniTopping <0 && numberOfPepperoniTopping>5) {
            System.err.println("Invalid entry");
            System.exit(0);
        }
        if(size == "large" && numberOfPepperoniTopping <0 && numberOfPepperoniTopping>6) {
            System.err.println("Invalid entry");
            System.exit(0);
        }
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public double calcTotalCost_Small(){
        double cost = (size == "small") ? 10 : (size == "medium") ? 12 : 14;
        cost += numberOfCheeseTopping * 2 + numberOfPepperoniTopping * 2;
        return cost;
    }

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                '}';
    }
}

/*
Pizza Task:
		5.1 Create class named Pizza:
				private variables:
					size, numberOfCheeseTopping, numberOfPepperoniTopping

				Encapsulate all the fields
						Conditions:
							size of the pizza can only be small, medium, large. case insensitive

							Number of cheese topping can not be negative, the maximum number of cheese topping is:
										small: 3
										medium: 4
										large: 5

							Number of pepperoni topping can not be negative, the maximum number of pepperoni topping is:

										small: 4
										medium: 5
										large: 6

				Add a constructor that allows user to set all the fields when the object is created.
								(If the arguments not valid it should not be set to the instances)


				Methods:
					calcCost(): returns the totalCost of the pizza
					toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()


		Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping







 */
