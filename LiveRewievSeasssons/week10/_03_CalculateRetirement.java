package week10;

public class _03_CalculateRetirement {

    //This example was implemented to show that we can call a method from another metheds

    public static void main(String[] args) {
        yearsUntilRetirement("Erdal",1989);
    }

    //calculate age of a person
    public static int calculateAge(int yearOFBirth){
        return 2022-yearOFBirth;
    }

    //lets assume 67 is our retirement age
    public static void yearsUntilRetirement(String name, int yearOfBirth){
        int yearsUntilRetirement = 67 - calculateAge(yearOfBirth);
        System.out.println(name + " retires in " + yearsUntilRetirement + " years");
    }

}
