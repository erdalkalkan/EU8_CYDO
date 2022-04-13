package day32_Constructors;

public class _05_ConstructorCalls {
    public _05_ConstructorCalls(){
        System.out.println("Default Constructor");
    }

    public _05_ConstructorCalls(int a){
        this(); // Default Constructor
        System.out.println("Constructor with int argument");
    }


    public _05_ConstructorCalls(String str){
        this(10); //Default Constructor ,  Constructor with int argument
        System.out.println("Constructor with String argument");
    }


    public static void main(String[] args) {

        _05_ConstructorCalls obj1 = new _05_ConstructorCalls();

        System.out.println("----------------------------");

        _05_ConstructorCalls obj2 = new _05_ConstructorCalls(10);

        System.out.println("----------------------------");

        _05_ConstructorCalls obj3= new _05_ConstructorCalls("Java");


    }





}
