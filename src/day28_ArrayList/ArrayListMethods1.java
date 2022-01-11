package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);  //index 0
        numbers.add(20);  //index 1
        numbers.add(30);  //index 2 ==> 3
        numbers.add(40);  //index 3 ==> 4
        numbers.add(50);  //index 4 ==> 5
        numbers.add(60);  //index 5 ==> 6

        numbers.add(2, 25);  //the number(element) at index 2 will become "25", the index numbers above will change.

        System.out.println(numbers);

        System.out.println( numbers.size() );

        int lastIndex = numbers.size() - 1;

        System.out.println("lastIndex = " + lastIndex);

        int num = numbers.get(3);
        System.out.println("num = " + num);

        System.out.println("-------------------------------------");

        for (int i = 0; i <numbers.size(); i++){

            System.out.println(numbers.get(i));
        }


        System.out.println("---------------------------------------");

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");

        list.set(2, "JavaScript");  //replace
        list.set(3, "C++");
        System.out.println(list);

        System.out.println("-----------------------------------------");

        //Remove method:

        ArrayList<String> employees = new ArrayList<>();

        employees.add("Suat");
        employees.add("Aygun");
        employees.add("Olga");
        employees.add("Neira");
        employees.add("Ali");
        employees.add("Hulya");
        employees.add("Kaloyan");

        System.out.println(employees);

        employees.remove(0);

        System.out.println(employees);

        employees.remove(0);

        System.out.println(employees);

        employees.remove(0);

        System.out.println(employees);


    }

}
