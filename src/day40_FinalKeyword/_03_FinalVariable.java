package day40_FinalKeyword;

public class _03_FinalVariable {
    final String birthDay;
    final static String name;

    static{
        name = "Batch 25";
    }

    public _03_FinalVariable(String birthDay) {
        this.birthDay = birthDay;
    }

    public final static void main(String[] args) {

        final double pi = 3.14;

        //pi = 4.14; final variables can not be reassigned
        // pi = 5.4;

        final String name;

        name = "Java";
        //   name = "Wooden Spoon";
        System.out.println(name);

        System.out.println("----------------------------------------");

        _03_FinalVariable obj = new _03_FinalVariable("May/01");
        //obj.birthDay = "June/01"; // final variables can not be reassigned
        System.out.println(obj.birthDay);


        System.out.println("----------------------------------------");

        //  FinalVariable.name = "Python";

        System.out.println(_03_FinalVariable.name);


    }


}
