package day35_Encapsulation.encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {

    public static void main(String[] args) {

        Candy candy1 = new Candy ("Maynards", 2, 1.99, false);
        Candy candy2 = new Candy ("Hersheys", 3, 3.99, true);
        Candy candy3 = new Candy ("Nestle", 4, 1.29, true);
        Candy candy4 = new Candy ("Lindt", 8, 2.99, false);
        Candy candy5 = new Candy ("M&M", 5, 2.29, true);
        ArrayList<Candy> Candies = new ArrayList<>();

        Candies.addAll(Arrays.asList(candy1, candy2, candy3, candy4, candy5));
        for(Candy Candy : Candies){
            System.out.println(Candy.getBrand() +" : $"+ Candy.getPrice());
        }

    }
}

/*
 1.2 Create a class named CandyFactory
                Create an ArrayList of candies
                Add five objects of candies
                use for each loop to print the brand and price of each candy
 */

