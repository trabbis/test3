package com.designpattern.builder;

/**
 * @author dchoi@nbsps.com
 *
 */
public class Waiter {
    
    private PizzaBuilder pizzaBuilder;
    public void setPizzaBuilder(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder= pizzaBuilder;
    }
    
    public Pizza getPizza() {
        return pizzaBuilder.getPizza();
    }

    public void makePizza() {
        pizzaBuilder.createNewPizza();
        pizzaBuilder.buildDough();
        pizzaBuilder.buildSauce();
        pizzaBuilder.buildTopping();
    }
}
