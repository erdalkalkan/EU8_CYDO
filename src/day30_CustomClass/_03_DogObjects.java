package day30_CustomClass;

import java.util.ArrayList;

public class _03_DogObjects {
    public static void main(String[] args) {

        _02_Dog dog1  = new _02_Dog();

        dog1.name = "Lucy";
        dog1.breed = "Husky";
        dog1.age = 5;
        dog1.gender = 'F';
        dog1.size = "Small";
        dog1.color = "White";


        _02_Dog dog2 = new _02_Dog();

        dog2.name = "ACE" ;
        dog2.breed = "Husky";
        dog2.age = 5;
        dog2.gender = 'M';
        dog2.size = "Large";
        dog2.color = "White & Black";

        _02_Dog dog3 = new _02_Dog();
        dog3.setInfo("Jack", "German Shepard", 2, 'M', "Large", "Black");

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        dog1.eat();

        dog2.bark();

        _02_Dog dog4 = new _02_Dog();
        dog4.setInfo("Bullet", "Labrador", 3, 'M', "Extra Large", "Yellow");

        _02_Dog dog5 = new _02_Dog();
        dog5.setInfo("Sully", "Pit-Bull", 6, 'M', "Large", "Black");

        System.out.println("-----------------------------------");

        _02_Dog[] dogs = {dog1, dog2, dog3, dog4, dog5};

        ArrayList<_02_Dog> femaleDogs =new ArrayList<>();
        ArrayList<_02_Dog> maleDogs =new ArrayList<>();





    }


}
