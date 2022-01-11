package day35_Encapsulation.encapsulation;

public class Item {

    private String name;
    private double unitPrice;
    private int quantity;

    public Item(String name, double unitPrice, int quantity){
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.isBlank()){
            System.err.println("Name can not be empty or blank");
            System.exit(0);
        }

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(0) >= 'a' && name.charAt(0) <= 'z' || name.charAt(0) >= 'A' && name.charAt(0) <= 'Z') {
                System.err.println("Invalid entry, name cannot have special characters");
                System.exit(0);
            }
        }
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if(unitPrice < 0){
            System.err.println("Invalid entry: " + unitPrice);
            System.exit(0);
        }
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity < 0 || name.equals("toilet paper") && quantity > 1){
            System.err.println("Invalid entry: " + quantity);
            System.exit(0);
        }
        this.quantity = quantity;
    }

    public double calcCost(){
        double TotalCost = quantity * unitPrice;
        return TotalCost;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                '}';
    }
}


/*
create a class called Item
	            private variables:
	            	name, unitPrice, quantity

            	Encapsulate all the fields:
            		Conditions:
            			name can not be empty or blank
            			name can not contain any special characters other than space
            			name must start with letters
            			unit price can not be negative
            			quantity can not be negative
            			if the Item name is toilet paper (case insensitive) then the quantity can not be more than 1


            Add a constructor that allows user to set all the fields when the object is created.
						(If the arguments not valid it should not be set to the instances)

            instance methods:
                calcCost(): returns the total cost
                toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()

 */