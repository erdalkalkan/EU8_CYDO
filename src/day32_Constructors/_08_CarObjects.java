package day32_Constructors;

public class _08_CarObjects {
    public static void main(String[] args) {

        _07_Car car1 = new _07_Car("Toyota");

        _07_Car car2 = new _07_Car("Honda", "Accord");

        _07_Car car3 = new _07_Car("Lexus", "RX350", 2021);

        _07_Car car4 = new _07_Car("BMW", "X6", 2020, 50000);

        _07_Car car5 = new _07_Car("Tesla", "Model 3", 2019, 70000, "Black");


        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);


    }

}
