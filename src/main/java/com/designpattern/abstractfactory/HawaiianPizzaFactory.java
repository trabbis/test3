package com.designpattern.abstractfactory;

public class HawaiianPizzaFactory extends PizzaFactory {

    
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
