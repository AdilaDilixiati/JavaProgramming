package day37_Inheritance.PhoneTask;

public class Iphone extends Phone{

    public Iphone(String model, String size, double price, String colour) {
        super("Apple", model, size, price, colour);
    }

    public void faceTime(long phoneNumber){
        System.out.println(brand+" "+model+" is having a face time with phone number: "+phoneNumber);
    }

    public void faceTime(String email){
        System.out.println(brand+" "+model+" is having a face time with email: "+ email);
    }
}

/*
Create a subclass of Phone named IPhone:
                Variables:
                    brand, model, size, price, color

                Methods:

                    call(long phoneNumber)
                    text(long phoneNumber)
                    faceTime(long phoneNumber)
                    faceTime(String email)
                    toString()
 */

