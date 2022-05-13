package day47_Polymorphism_and_OOP_Review;

public class _03_InheritanceReview {

    int a;

    public _03_InheritanceReview(int a){
        System.out.println("Parent class' constructor");
    }

    void method1(){

    }

}


class A extends  _03_InheritanceReview{

    public A(int a) {
        super(a);
    }

}

class B extends  _03_InheritanceReview{

    public B(int a) {
        super(a);
    }
}

class C extends  _03_InheritanceReview{

    public C(int a) {
        super(a);
    }
}


class Aa extends A{

    public Aa(int a) {
        super(a);
    }
}

class Bb extends B{

    public Bb(int a) {
        super(a);
    }
}

class Cc extends C{

    public Cc(int a) {
        super(a);
    }
}

class D{
    void m(){
        super.toString(); // Object class
    }
}