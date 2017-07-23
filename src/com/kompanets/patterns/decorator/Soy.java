package com.kompanets.patterns.decorator;

/**
 * Created by spirited on 11.07.2017.
 */
public class Soy extends CondimentDecorator {
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 1.00;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " Soy";
    }
}
