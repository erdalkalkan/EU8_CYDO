package week11;

import java.util.Arrays;

public class _01_AddElementToArray {

    public static void main(String[] args) {
        String[] browserTypes = {"Crome","Firefox","Safari"};
        String newBrowserOne = "Edge";
        String newBrowserTwo = "Opera";

        browserTypes = addElement(browserTypes, newBrowserOne);
        System.out.println(Arrays.toString(browserTypes));

        browserTypes = addElement(browserTypes, newBrowserTwo);
        System.out.println(Arrays.toString(browserTypes));
    }

    public static String[] addElement (String[] arr, String element){
        String [] newArray = new String[arr.length+1];

        int i=0;
        for ( ; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        newArray[i] = element;
        return newArray;

    }


}
