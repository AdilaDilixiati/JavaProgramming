package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstDuplicatedElement {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.addAll(Arrays.asList(1,2,2,3,4,4,5,6,7,7));

        int firstDuplicatedElement = 0;

        for (Integer each : numbers) {

            int frequency = 0;

            for (Integer element : numbers) {
                if(each == element){
                    frequency++;
                }
            }

            if(frequency > 1){
                firstDuplicatedElement = each;
                break;
            }

        }

        System.out.println("firstDuplicatedElement = " + firstDuplicatedElement);
    }
}








/*
Write a program that can return the first duplicated element from an arrayList of Integer
		Ex:
			list = [1,2,2,3,4,4,5,6,7,7];
			output:
				2
 */