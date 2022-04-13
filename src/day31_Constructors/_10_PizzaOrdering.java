package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class _10_PizzaOrdering {
    public static void main(String[] args) {



        ArrayList<_09_Pizza> pizzas = new ArrayList<>();

        // create 100 pizza objects: size - 'S',  cheese topping-2, pepperoni topping -3
        // create 100 Pizza Objects: size - 'M', cheese topping-3,  pepperoni topping -4
        //create 100 Pizza Objects: size - 'L', cheese topping-4,  pepperoni topping -5

        for (int i = 0; i < 100; i++) {

            _09_Pizza smallPizza = new _09_Pizza('S', 2, 3);
            _09_Pizza mediumPizza = new _09_Pizza('M', 3, 4);
            _09_Pizza largePizza = new _09_Pizza('L', 4, 5);

            pizzas.addAll(Arrays.asList(smallPizza, mediumPizza, largePizza) );

        }


        System.out.println("Total number of pizza: "+pizzas.size());
        double totalPrice = 0;

        for (_09_Pizza pizza : pizzas) {
            totalPrice += pizza.calcCost();

        }

        System.out.println("totalPrice = " + totalPrice);



    }


}
