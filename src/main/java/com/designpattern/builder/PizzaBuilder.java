package com.designpattern.builder;

public abstract class PizzaBuilder {
    protected Pizza pizza;
    
    public void createNewPizza() {
        pizza = new Pizza();
    }
    
    public Pizza getPizza() {
        return pizza;
    }
    public abstract void buildDough();
    public abstract void buildSauce();
    public abstract void buildTopping();
    

}
