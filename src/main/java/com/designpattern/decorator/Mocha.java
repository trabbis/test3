package com.designpattern.decorator;

public class Mocha extends CondimentDecorator {

    Beverage beverage;
    public Mocha(Beverage bev) {
        beverage = bev;
    }
    
    @Override
    public double getCost() {
        return beverage.getCost() + 0.1;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

}
