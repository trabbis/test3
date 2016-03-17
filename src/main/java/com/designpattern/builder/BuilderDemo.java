/****************************************************************************************
 * $RCSfile: eclipse-codetemplates.xml,v $  $Revision: 1.4 $  $Date: 2014/10/10 20:48:18 $
 * Copyright 2008,2014 All rights reserved. NBS Payment Solutions Inc.
 *
 ****************************************************************************************/

package com.designpattern.builder;

/**
 * This example looks like more abstract factory pattern. 
 */
public class BuilderDemo {
    
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        HawaiianPizzaBuilder pizzaBuilder = new HawaiianPizzaBuilder();
        waiter.setPizzaBuilder(pizzaBuilder);
        
        waiter.makePizza();
        
        String pizza = waiter.getPizza().toString();
        System.out.println(pizza);
        
        
        
    }

}
