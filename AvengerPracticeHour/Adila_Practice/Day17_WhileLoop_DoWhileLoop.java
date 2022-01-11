package Adila_Practice;

import java.util.Scanner;

public class Day17_WhileLoop_DoWhileLoop {

    public static void main(String[] args) {

        for (char i = 'A'; i <= 'Z'; i++) {

            System.out.print(i + " "); // A B C D E F

            if (i == 'P') {
                break; // Exits the loop
            }

        }

        System.out.println();

    }
}