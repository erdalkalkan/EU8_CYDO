package _01_Variables;

import java.util.Scanner;

public class _03_AddNumbers {
/*
In this assignment you will create a Scanner object and ask user to enter 3 number inputs.

Declare integer variables num1, num2, num3, sum.

Create a Scanner object named scan.

Flow:

-Display prompt "Enter 3 numbers:"

-Using scanner object let user input 3 numbers

-Add 3 numbers and assign to sum variable

-Print "Sum of numbers: ValueOfSum"
*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int first = scan.nextInt();
        int second = scan.nextInt();
        int third = scan.nextInt();


        int a=first+second+third;
        System.out.println("Sum of numbers: "+a);



}


}
