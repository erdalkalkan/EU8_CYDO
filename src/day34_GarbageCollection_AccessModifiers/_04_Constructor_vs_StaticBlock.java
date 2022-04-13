package day34_GarbageCollection_AccessModifiers;

public class _04_Constructor_vs_StaticBlock {
    static{
        System.out.println("Static Block");
    }

    public _04_Constructor_vs_StaticBlock(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {

        new _04_Constructor_vs_StaticBlock(); //1
        new _04_Constructor_vs_StaticBlock(); //2
        new _04_Constructor_vs_StaticBlock(); //3
        new _04_Constructor_vs_StaticBlock(); //4
        new _04_Constructor_vs_StaticBlock(); //5

    }


}
