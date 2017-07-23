package com.kompanets.patterns.decorator;

/**
 * Created by spirited on 11.07.2017.
 */
public class Espresso extends Beverage {
    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double cost() {
        return 8.10;
    }
}
