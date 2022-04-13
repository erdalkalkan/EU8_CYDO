package day30_CustomClass;

import java.util.ArrayList;

public class _07_StudentObject {
    public static void main(String[] args) {

        _06_Student student1 = new _06_Student();
        student1.setInfo("Aygun", 'F', 39, 2210, 'A');

        _06_Student student2 = new _06_Student();
        student2.setInfo("Hulya", 'F', 26, 2123, 'B');

        _06_Student student3 = new _06_Student();
        student3.setInfo("Elminur", 'F',26,2215,'A');

        _06_Student student4 = new _06_Student();
        student4.setInfo("Ali", 'M',28,5511,'B');

        _06_Student student5 = new _06_Student();
        student5.setInfo("Mert", 'M', 26 ,2252, 'C');


        _06_Student[] students = {student1, student2, student3, student4, student5};

        for (_06_Student student : students) {
            System.out.println(student);
        }

        System.out.println("-----------------------------------------------------");

        ArrayList<_06_Student> earlyBirds = new ArrayList<>(); // grade: A
        ArrayList<_06_Student> angryBirds = new ArrayList<>();

        for (_06_Student student : students) {

            if(student.grade == 'A'){
                earlyBirds.add(student);
            }else{
                angryBirds.add(student);
            }

        }

        System.out.println("-----------------------------------------------------");
        System.out.println(earlyBirds);

        System.out.println("-----------------------------------------------------");

        System.out.println(angryBirds);
        System.out.println("-----------------------------------------------------");

    }


}
