package day35_Encapsulation.encapsulation;

/*
as a developer
1) we want to control the accessing our variables
2) we want to control the assigning value inside the variables
3) we want to control which user set the variable or which user only get the variable
you can think like this
 */

public class Person {

    private String name;
    private int age;


    public String getName(){
       return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if (age <= 0 || age > 150){
            System.err.println("Invalid Age: " + age);
            System.exit(0);
        }

        this.age=age;
    }

    /*
    getter is used to read the data.
    1) to be able to get the private data;
    2) getter must be "public" and must be start with"get...";
    3) data type must be the same;
    4)no additional info is needed, no parameter is needed for getter.
     */


    /*
    setter is used to modify the data.
    1) return type must be void;
    2) needs additional info (data type of the parameter must be match).
     */
}
