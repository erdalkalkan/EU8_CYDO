package day34_GarbageCollection_AccessModifiers;

public class _05_CydeoStudent {
    public String studentName;
    public static String schoolName;

    public _05_CydeoStudent(String studentName){
        this.studentName = studentName;

    }

    static{
        schoolName = "Cydeo School";
    }

}


class CydeoStudentObject{

    public static void main(String[] args) {

        _05_CydeoStudent student1 = new _05_CydeoStudent("Jimmy");
        _05_CydeoStudent student2 = new _05_CydeoStudent("Kathy");

        System.out.println(student1.schoolName);
        System.out.println(student2.schoolName);

    }

}
