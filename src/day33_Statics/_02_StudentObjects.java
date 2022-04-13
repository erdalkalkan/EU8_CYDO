package day33_Statics;

import java.util.Arrays;

public class _02_StudentObjects {


    public static void main(String[] args) {

        _01_Student student1 = new _01_Student("Ahmet");

        _01_Student student2 = new _01_Student("Aygun", 'F');

        _01_Student student3 = new _01_Student("Nigara", 11);

        _01_Student student4 = new _01_Student("Mert", 12, 'A');

        _01_Student student5 = new _01_Student("Cihad", 'M', 28);

        _01_Student student6 = new _01_Student("Suhaib", 'M', 27, 15);

        _01_Student student7= new _01_Student("Ali",'M',42,30,'A');


        System.out.println(student1 == student2);


        _01_Student[] students = { student1, student2, student3, student4, student5, student6, student7};


        System.out.println(Arrays.toString(students) );



    }


}
