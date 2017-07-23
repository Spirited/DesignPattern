package com.kompanets.patterns.decorator;

/**
 * Created by spirited on 11.07.2017.
 */
public class DecoratorMainClass {
    public static void main(String[] args) {
//        Beverage espresso = new Soy(new Milk(new Espresso()));
//        System.out.println(espresso.getDescription());
//        System.out.println(espresso.cost());

        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription());
        System.out.println(espresso.cost());




        Beverage doubleMilk = new Milk(new Milk(new Espresso()));//new Double(new Milk(new Espresso()));
        System.out.println(doubleMilk.getDescription());
        System.out.println(doubleMilk.cost());


        Beverage doubleEspresso = new Milk(new Double(new Espresso()));
        System.out.println(doubleEspresso.getDescription());
        System.out.println(doubleEspresso.cost());
    }
}
