package com.designpattern.builder;

public class AsiaPizzaBuilder extends PizzaBuilder {
    
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
