package _03_String;

import java.util.Scanner;

public class _14_StringNoEnd {
//Given a String **txt** print the value without the last letter
//
//        Ex:
//
//        ```
//        Input:
//        foo
//        ```
//        ```
//        Output:
//        fo
//        ```
//
//        ```
//        Input:
//        run
//        ```
//        ```
//        Output:
//        ru
//        ```
//
//        Hint: Use substring() and length()

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();
        //your code here
        System.out.println(txt.substring(0,txt.length()-1));

    }
}
