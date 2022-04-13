package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class _05_CarObjects {
    public static void main(String[] args) {

        _04_Car car1  = new _04_Car();
        //car1.setInfo("Toyota", "Camry", "White", 2021, 35000);
        car1.setInfo("Opel", "Meriva", "Yellow of Honey", 2009, 2500);

        System.out.println(car1);


        _04_Car car2 = new _04_Car();
        car2.setInfo("BMW", "335is", "Black", 2020, 45000);

        System.out.println(car2);


        _04_Car car3 = new _04_Car();
        car3.setInfo("Audi", "Q7", "Red", 2019, 40000);

        System.out.println(car3);

        System.out.println("------------------------------------------------------------");

        // Car[] cars = { car1, car2, car3 };

        ArrayList<_04_Car> carsList = new ArrayList<>();
        carsList.addAll(Arrays.asList(car1, car2, car3)) ;

        for(_04_Car each  : carsList){
            System.out.println( each.brand +" : "+each.price  );
        }

        System.out.println("------------------------------------------------------------");

        /*
         Recall:
            BMW: 2005 ~ 2008
            Toyota: 1995 ~ 1997
         */

        carsList.removeIf( p -> p.brand.equals("BMW") && p.year >= 2005 && p.year <= 2008 );
        carsList.removeIf( p -> p.brand.equals("Toyota") && p.year >= 1995 && p.year <= 1997);



    }


}
