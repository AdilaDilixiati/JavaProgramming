package Adila_Practice;

public class Day15_ForLoop_ReverseString {

    public static void main(String[] args) {

        String str = "cybertek";

        for (int i = str.length()-1; i >=0; i--) {

            System.out.print(str.charAt(i));
        }
    }

}



/*
 Write a program that can reverse any given string
			Ex:
				input:
					Wooden Spoon
				output:
					noopS nedooW
 */