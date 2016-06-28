package com.designpattern.abstractfactory;

public class AsiaPizzaFactory extends PizzaFactory {
    
    @Override
    public void buildDough() {
        pizza.setDough("asia dough");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("asia sauce");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("asia topping");
    }
    

}
