package Adila_Practice;

public class Day18_NestedLoop_FrequencyOfCharacter {

    public static void main(String[] args) {

        String s = "the game was tied at 2-2";
        String s2 = s.substring(5);

        int index1 = s.indexOf("game");
        int index2 = s2.indexOf("game");

        if (index1 == index2) {
            System.out.println(index1);
        } else {
            System.out.println(index2);
        }
        System.out.println("--------------------------");

        /*String z = "popcorn";
        z = z.substring(1, 8);

        System.out.println(z);

        System.out.println("----------------------------");
*/
        for (int i = 0; i < 10; i++) {

            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
/*
            System.out.println("---------------------------------");

            int number =5;

            while (number < 100){
                number += number;
            }
            System.out.println(number);
        }
*/
            System.out.println("----------------");

            int a = 0;
            do {

                a = a++ + --a - (a % 3);
            } while (++a < 4);
            System.out.println(a);
        }

        System.out.println("----------------------------");

        String str = "The whole time it was raining.";

        do {

            System.out.println(str.charAt(0));
            str = str.substring(3);
        }while(!str.isEmpty());


    }
}


/*
Write a program that can find the frequency of the characters from a string
			 Ex:
                        str = "aabcccd";
                        output:
                               a2b1c3d1
Hint: if you find out how to find the frequency of one character, then repeat it for all the remaining characters
 */