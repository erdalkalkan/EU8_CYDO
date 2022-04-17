package utilities;

import day40_FinalKeyword._02_ProtectedAccessModifier;

public class AccessModifiers_Test4 extends _02_ProtectedAccessModifier {
    public static void main(String[] args) {

       // System.out.println(AccessModifiers_Test4.name1);

        System.out.println(AccessModifiers_Test4.name2);
        //protected is visible outside package subclass only

       // AccessModifiers_Test4.method1();
        AccessModifiers_Test4.method2();

    }
}
