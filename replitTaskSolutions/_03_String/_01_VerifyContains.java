package _03_String;

import java.util.Scanner;

public class _01_VerifyContains {
//Write a program that will verify if the **sentence** contains **word**.
// Print out the result as a boolean value.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String sentence = scan.nextLine();
        //WRITE YOUR CODE HERE
        System.out.println(sentence.contains(word));
    }
}
