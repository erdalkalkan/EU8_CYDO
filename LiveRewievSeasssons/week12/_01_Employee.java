package week12;

public class _01_Employee {

    public String name, jobTitle;
    public int ID;
    public double salary;

    public _01_Employee(){
        // no parameter constructor
    }

    public _01_Employee(String name, String jobTitle, int ID, double salary  ){
        this.name = name; // I am getting a name from constructor and assigning it to the field of the object that I am creating
        this.jobTitle = jobTitle;
        this.ID = ID;
        this.salary = salary;
    }


    public String asString() {
        return "Employee {" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", ID=" + ID +
                ", salary=" + salary +
                '}';
    }
}
