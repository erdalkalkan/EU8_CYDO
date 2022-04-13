package week11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class _02_DistinctNumbers {

    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter integers (input ends with 0) : ");

        int value;

        do {
            value = input.nextInt();
            if (!list.contains(value) && value !=0 ){
                list.add(value);
            }
        }while (value!=0);

        for (Integer numbers : list) {
            System.out.println(numbers+" ");
        }
        System.out.println("the size of our array "+list.size());

        Collections.sort(list);
        System.out.println(list);

        int max= Collections.max(list);
        int min= Collections.min(list);
        System.out.println("max = " + max);
        System.out.println("min = " + min);

        Collections.shuffle(list);
        System.out.println(list);

    }
}
