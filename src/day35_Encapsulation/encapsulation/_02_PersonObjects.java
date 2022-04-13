package day35_Encapsulation.encapsulation;

public class _02_PersonObjects {
    public static void main(String[] args) {

        _01_Person p1 = new _01_Person();
        // p1.name = "Daniel";
        //  p1.age = 28;

        //   p1.name = "";
        //   p1.age = 2000;

        p1.setName("Daniel");
        p1.setAge(45);

        //    System.out.println(p1.name +" : "+p1.age);

        System.out.println(p1.getName()+" : "+p1.getAge());



    }

}
