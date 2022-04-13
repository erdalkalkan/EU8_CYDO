package _00_Basics;

import java.util.Scanner;

public class _11_PrintVariable04 {
/*    Given a String variable word assume the variable has a value and use it to display the word of the day.

            Ex: Input: Java

    Output: Today's word of the day is: Java

    Ex: Input: Apple

    Output: Today's word of the day is: Apple
*/

    public static void main(String[] args) {

        String word = new Scanner(System.in).nextLine();

        System.out.println("Today's word of the day is: "+word);


    }


}
