package day32_Constructors;

public class _03_Employee {
    public String name;
    public char gender;
    public String jobTitle;
    public double salary;


    public _03_Employee(String name){
        this.name = name;
    }

    public _03_Employee(String name, char gender){
        this(name); //this.name = name;
        this.gender = gender;

    }

    public _03_Employee(String name, char gender, String jobTitle){
        this(name, gender);
        this.jobTitle = jobTitle;
    }

    public _03_Employee(String name, char gender, String jobTitle, double salary){
        this(name, gender, jobTitle);
        this.salary = salary;
    }


    /*
    public void method1(){
        this("Aaron");
    }
*/

    public String toString() {
        return "Employee {" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }


    /*
    public void method1(){
        System.out.println("Method 1");
    }
    public void method2(){
        method1();
    }
    */

}
