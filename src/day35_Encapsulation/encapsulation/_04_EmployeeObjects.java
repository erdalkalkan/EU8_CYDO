package day35_Encapsulation.encapsulation;

public class _04_EmployeeObjects {
    public static void main(String[] args) {

        _03_Employee employee1 = new _03_Employee("Tahir", 'M', 30, 120000);

        employee1.setAge(32);


        _03_Employee employee2 = new _03_Employee("Aygun", 'F', 31, 115000);
        employee2.setName("Elvira");
        employee2.setSalary( employee2.getSalary() + 15000 );

        System.out.println(employee1);
        System.out.println(employee2);


    }

}
