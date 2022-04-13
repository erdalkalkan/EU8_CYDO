package day30_CustomClass;

public class _09_CapitalOne {
    public static void main(String[] args) {

        _08_Employee employee1 = new _08_Employee();
        _08_Employee employee2 = new _08_Employee();
        _08_Employee employee3 = new _08_Employee();
        _08_Employee employee4 = new _08_Employee();
        _08_Employee employee5 = new _08_Employee();

        employee1.setInfo("John",'M',25,2237,"Developer",100000,true);
        employee2.setInfo("Anna",'F',28,2287,"QA",85000,true);
        employee3.setInfo("David",'M',35,2256,"QA",45000,false);
        employee4.setInfo("Lina",'F',45,2290,"Manager",80000,true);
        employee5.setInfo("Kevin",'M',35,2298,"Senior QA", 110000,true);


        _08_Employee[] employees = { employee1, employee2, employee3, employee4, employee5 };

        int countFullTime = 0;
        int countPartTime = 0;
        double max = employees[0].salary;
        double min = employees[0].salary;

        for (_08_Employee employee : employees) {

            if(employee.isFullTime){
                countFullTime++;
            }else{
                countPartTime++;
            }

            if(employee.salary > max){
                max = employee.salary;
            }

            if(employee.salary < min){
                min = employee.salary;
            }

        }


        System.out.println("countPartTime = " + countPartTime);
        System.out.println("countFullTime = " + countFullTime);
        System.out.println("min = " + min);
        System.out.println("max = " + max);



    }


}
/*
CapitalOne Class:
	1. create 5 Employee objects
	2. store those 5 employee objects into an array
	3. how many employees are full time employees?
	4. What's the minimum salary
	5. what's the maximum salary
 */
