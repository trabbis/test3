/****************************************************************************************
 * $RCSfile: eclipse-codetemplates.xml,v $  $Revision: 1.4 $  $Date: 2014/10/10 20:48:18 $
 * Copyright 2008,2014 All rights reserved. NBS Payment Solutions Inc.
 *
 ****************************************************************************************/

package com.designpattern.abstractfactory;

/**
 * This example looks like more abstract factory pattern.
 * Yes, this is not builder design pattern. Abstract Factory Pattern 
 */
public class FactoryDemo {
    
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        HawaiianPizzaFactory pizzaBuilder = new HawaiianPizzaFactory();
        waiter.setPizzaBuilder(pizzaBuilder);
        
        waiter.makePizza();
        
        String pizza = waiter.getPizza().toString();
        System.out.println(pizza);
        
        
        
    }

}
