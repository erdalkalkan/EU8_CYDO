package _03_String;

import java.util.Scanner;

public class a {
    public static void main(String[] args) {


    Scanner scan=new Scanner(System.in);
    System.out.println("Please enter the text");
    String input= scan.nextLine();

        System.out.println("Lenght is "+input.length());

        int a=5;
        System.out.println(a/2);

        System.out.println(input.valueOf(input.charAt(0))+input.valueOf(input.charAt(1)) );

    }
}
