package day32_Constructors;

public class _04_EmployeeObjects {

    public static void main(String[] args) {

        _03_Employee employee1 = new _03_Employee("Aaron");

        _03_Employee employee2 = new _03_Employee("Yuliya", 'F');

        _03_Employee employee3 = new _03_Employee("Olga", 'F', "SDET");


        System.out.println(employee1);

        System.out.println(employee2);

        System.out.println(employee3);

    }


}
