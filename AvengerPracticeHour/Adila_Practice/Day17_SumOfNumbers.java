package Adila_Practice;

import java.util.Scanner;

public class Day17_SumOfNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;

        int num;
        while (true) {
            System.out.println("Please enter a number: ");
            num = scan.nextInt();
            if (num < 0) ;
            break;
        }
        sum += num;
        System.out.println(sum);
        scan.close();
    }

}

/*
Write a program that calculates the sum of numbers entered by the user until user enters a negative number.
*/