package _03_String;

import java.util.Scanner;

public class _03_FindTheLength {
//Write a program that will output length of the text (string).
//
//        Example:
//
//
//        ```
//        Display message: "Please enter the text:"
//        ```
//
//        ```
//        input: java
//        ```
//
//        ```
//        Display message: "Length is: 4"
//        ```

    public static void main(String[] args) {
        //WRITER YOU CODE HERE
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the text:");
        String input=in.nextLine();
        System.out.println("Length is: "+input.length());
    }
}
