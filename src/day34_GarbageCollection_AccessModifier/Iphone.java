package day34_GarbageCollection_AccessModifier;

import org.w3c.dom.ls.LSOutput;

public class Iphone {

        public static String brand, OS, madeIn, designedIn;
        public static boolean isSmartPhone;
        public String colour, model;
        public double size, price;


        static {
            brand = "Apple";
            OS = "iOS";
            madeIn = "China";
            designedIn = "California";
            isSmartPhone = true;
        }

    public Iphone(String colour, String model, double price, double size, boolean isSmartPhone) {
        this.colour = colour;
        this.model = model;
        this.price = price;
        this.size = size;
    }

    public static void printOperatingSystem(){
        System.out.println(brand + " operating system is: " + OS);
    }

    public void call(long phoneNumber){
        System.out.println(brand + model + " is calling from " + phoneNumber );
    }

    public void text (long phoneNumber){
        System.out.println(brand + model + " is texting from " + phoneNumber);
    }

    public void facetime(long phoneNumber){
        System.out.println(brand + model + " is facetiming from phone number " + phoneNumber);
    }

    public void facetime(String email){
        System.out.println(brand + model + " is facetiming from an email address " + email);
    }

    public String toString() {
        return "Iphone{" +
                "colour='" + colour + '\'' +
                ", model='" + model + '\'' +
                ", size=" + size +
                ", price=" + price +
                '}';
    }
}

/*
Create a class named Iphone
            variables:
                brand, model, size, color, price, OS, isSmartPhone, madeIn, designedIn

            Add a constructor to initialized all the fields

            Add a static block to initialize all the statics

            Methods:
                printOperatingSystem(): displays the operating system of the iphone
                call(long phoneNumber)
                text(long phoneNumber)
                faceTime(long phoneNumber)
                faceTime(String email)
                toString()
 */