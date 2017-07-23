package com.kompanets.patterns.decorator;

/**
 * Created by spirited on 11.07.2017.
 */
public abstract class Beverage {
    protected String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }
    abstract public double cost();
}
