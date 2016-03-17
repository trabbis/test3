package com.designpattern.builder;

public class HawaiianPizzaBuilder extends PizzaBuilder {

    
    @Override
    public void buildDough() {
        pizza.setDough("hawaii dough");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("hawaii sauce");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("hawaii topping");
    }
    
}
