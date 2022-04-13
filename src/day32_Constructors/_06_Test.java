package day32_Constructors;

public class _06_Test {
 public _06_Test(){ //A
    System.out.println("A");
}

    public _06_Test(int a){ //A  B
        this();
        System.out.println("B");
    }

    public _06_Test(double a){ //A B C
        this(10);
        System.out.println("C");
    }

    public _06_Test(String str){ // A B C D
        this(2.5);
        System.out.println("D");
    }

    public static void main(String[] args) {

        new _06_Test("Java");

    }




}
