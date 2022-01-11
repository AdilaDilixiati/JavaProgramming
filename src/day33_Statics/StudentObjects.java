package day33_Statics;

import java.util.Arrays;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student("Ahmet");

        Student student2 = new Student("Aygun", 11);

        Student student3 = new Student("Mert", 12, 'M');

        Student student4 = new Student("Cihad", 'M', 28);

        Student student5 = new Student("Nigara", 'F', 32);

        Student student6 = new Student("Subhi", 'F', 26, 6389);

        Student student7 = new Student("Ali", 'M', 34, 8745, 'B');
        System.out.println(student1 == student2);


        Student[] students = { student1, student2, student3, student4, student5, student6, student7};


        System.out.println(Arrays.toString(students) );

    }

}