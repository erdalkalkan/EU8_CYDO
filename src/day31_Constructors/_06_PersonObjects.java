package day31_Constructors;

public class _06_PersonObjects {
    public static void main(String[] args) {

        _05_Person person1 = new _05_Person("Daniel", 'M', 32);

        _05_Person person2 = new _05_Person("Kseniia", 'F', 28);

        person2.age = 30;

        System.out.println(person1);
        System.out.println(person2);




    }


}
