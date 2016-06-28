/****************************************************************************************
 * $RCSfile: eclipse-codetemplates.xml,v $  $Revision: 1.4 $  $Date: 2014/10/10 20:48:18 $
 * Copyright 2008,2014 All rights reserved. NBS Payment Solutions Inc.
 *
 ****************************************************************************************/

package com.designpattern.builder3;

/**
 * This is really good example of builder design pattern
 * @see http://javarevisited.blogspot.com/2012/06/builder-design-pattern-in-java-example.html
 *
 */
public class BuilderDemo3 {

    public static void main(String args[]) {
        
        //Creating object using Builder pattern in java
        Cake whiteCake = new Cake.Builder().sugar(1).butter(0.5).eggs(2).vanila(2).flour(1.5).bakingpowder(0.75).milk(0.5).build();
      
        //Cake is ready to eat :)
        System.out.println(whiteCake);
    }

    
}
