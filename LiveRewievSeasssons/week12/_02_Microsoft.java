package week12;

public class _02_Microsoft {
    public static void main(String[] args) {

        String[] arr = {"ab","cv","ed"};

        _01_Employee employee1 = new  _01_Employee();
        // employee1 ---> is just a reference
        System.out.println(employee1.asString());
        employee1.name = "Emir";
        employee1.jobTitle="Product Owner";
        employee1.ID = 100;
        employee1.salary= 250000;
        System.out.println(employee1.asString());

        _01_Employee[] testers = {
                new  _01_Employee("Yasin","SDET",123,150000),
                new  _01_Employee("Erol","QA Lead",101,170000),
                new  _01_Employee("Rumeysa","QA Engineer",232,120000),
                new  _01_Employee("Dilek","SDET",134,155000)
        };

        // let's find max salary
        double maxSalary = Double.MIN_VALUE;
        for( _01_Employee each : testers){
            System.out.println(each.asString());
            // each is a reference for our objects created inside the array
            if(each.salary>maxSalary)
                maxSalary = each.salary;
        }

        System.out.println("maxSalary = " + maxSalary);

        System.out.println(testers[0].name);

    }
}
