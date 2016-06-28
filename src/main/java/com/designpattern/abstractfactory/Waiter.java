package com.designpattern.abstractfactory;

/**
 * @author dchoi@nbsps.com
 *
 */
public class Waiter {
    
    private PizzaFactory pizzaBuilder;
    public void setPizzaBuilder(PizzaFactory pizzaBuilder) {
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
