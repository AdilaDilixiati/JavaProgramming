package Adila_Practice;

public class Day23_CustomMethod_Void_EachElement {

    public static void main(String[] args) {
        eachElement(new int[] {1,2,3,50,100,200});
    }
    public static void eachElement(int[] numbers){
        for (int number : numbers){
            System.out.println(number);
        }

    }
}

/*
create a method named printEachElement that can print each element of an integer array;
 */