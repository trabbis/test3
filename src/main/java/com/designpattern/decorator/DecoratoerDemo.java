package com.designpattern.decorator;

public class DecoratoerDemo {
    
    public static void main(String[] args) {
        
        Beverage beverage = new Expresso();
        System.out.println(beverage.getDescription() + " " + beverage.getCost());
        
        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.getDescription() + " " + beverage2.getCost());
        
        
    }

}
