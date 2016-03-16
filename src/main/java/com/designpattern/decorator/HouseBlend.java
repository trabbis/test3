package com.designpattern.decorator;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "house blend";
    }
    @Override
    public double getCost() {
        return 2.0;
    }

}
