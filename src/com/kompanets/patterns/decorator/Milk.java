package com.kompanets.patterns.decorator;

/**
 * Created by spirited on 11.07.2017.
 */
public class Milk extends CondimentDecorator {
    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + .50;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }
}
