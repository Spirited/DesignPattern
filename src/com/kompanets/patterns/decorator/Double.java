package com.kompanets.patterns.decorator;

/**
 * Created by spirited on 12.07.2017.
 */
public class Double extends CondimentDecorator {
    private Beverage beverage;

    public Double(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return "Double " + beverage.getDescription();
    }

    @Override
    public double cost() {
        return beverage.cost() + beverage.cost();
    }
}
