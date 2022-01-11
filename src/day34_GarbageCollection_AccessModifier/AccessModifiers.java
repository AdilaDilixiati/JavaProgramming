package day34_GarbageCollection_AccessModifier;

public class AccessModifiers {

    public static int publicData = 100;
    static int defaultData = 200; //access modifier: default. "default" keyword is not an access modifier.
    private static int privateData = 300;

    public static void method1(){
        System.out.println("Public");
    }
    static void method2(){
        System.out.println("Default");
    }
    private void method3(){
        System.out.println("Private");
    }

    public static void main(String[] args) {

    }

}
