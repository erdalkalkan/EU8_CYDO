package _03_String;

import java.util.Scanner;

public class _06_PrintFirstAndLastLetters {
    //Write a program that will print out first and last letters together.
//
//        ```
//        Input: adobe
//        ```
//
//        ```
//        Output: ae
//        ```

    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE


        System.out.println(Character.toString(word.charAt(0)) + Character.toString(word.charAt(word.length() - 1)));
        System.out.println((word.charAt(0)+""+word.charAt(word.length()-1)));
    }
}
