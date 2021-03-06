/****************************************************************************************
 * $RCSfile: eclipse-codetemplates.xml,v $  $Revision: 1.4 $  $Date: 2014/10/10 20:48:18 $
 * Copyright 2008,2014 All rights reserved. NBS Payment Solutions Inc.
 *
 ****************************************************************************************/

package com.designpattern.observer;

/**
 * @author dchoi@nbsps.com
 * interface or abstract
 * You can use abstract class here instead of interface,
 * but interface is better design choice, because it gives more flexibility
 */
public interface Observer2 {
    //public Subject subject;
    public abstract void update(int temperature);
    
}
