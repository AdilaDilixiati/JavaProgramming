package day37_Inheritance.animalTask;

public class Dog extends Animal{

    public Dog(String name, String breed, char gender, int age, String size, String colour) {
        super(name, breed, gender, age, size, colour);
    }

    public void scratch(){
        System.out.println(name + " is scratching");
    }
}
