package day27_WrapperClasses;

public class WrapperClassesIntro {

    public static void main(String[] args) {

        int num1 = 200;

        //Long n1 = num1;
        Integer n1 = num1; //autoboxing

        int num2 = n1; //unboxing

        System.out.println("-------------------------------");

        Integer integerValue = 100;

        long longValue = integerValue;

        System.out.println("-------------------------------");

        int num3 = 200;
        // Long l2 = num3;
        Integer num4 = num3; //autoboxing
    }
}
