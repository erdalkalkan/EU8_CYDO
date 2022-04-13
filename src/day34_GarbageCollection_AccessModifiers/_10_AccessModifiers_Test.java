package day34_GarbageCollection_AccessModifiers;

public class _10_AccessModifiers_Test {

    public static void main(String[] args) {

        System.out.println( _09_AccessModifiers.publicData );
        System.out.println( _09_AccessModifiers.defaultData );
        //    System.out.println( AccessModifiers.privateData ); // private is not visible outside the class

        _09_AccessModifiers.method1();
        _09_AccessModifiers.method2();
        //    AccessModifiers.method3(); // private is not visible outside the class


        //go to utility package and look at the AccessModifiers_Test class to examples


    }

}
