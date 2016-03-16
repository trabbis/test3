package com.designpattern.decorator;

public abstract class Beverage {
    public String description = "default";
    
    public String getDescription() {
        return description;
    }
    public abstract double getCost();
    

}
