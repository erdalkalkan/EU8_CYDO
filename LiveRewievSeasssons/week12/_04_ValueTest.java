package week12;

public class _04_ValueTest {
    public static void main(String[] args) {
        _03_Value value = new  _03_Value();
        // print if I called set Value method
        System.out.println(value.calledMethod); // false
        // print the parameter without assigning anything
        System.out.println(value.getValue()); // 0

        value.setValue(5);
        System.out.println(value.calledMethod);// true
        System.out.println(value.getValue());// 5



        _03_Value value1 = new  _03_Value(3);
        System.out.println(value1.calledConstructor); // true
        System.out.println(value1.calledMethod); // false
        System.out.println(value1.getValue()); // 3

    }
}
