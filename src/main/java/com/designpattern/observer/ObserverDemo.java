/****************************************************************************************
 * $RCSfile: eclipse-codetemplates.xml,v $  $Revision: 1.4 $  $Date: 2014/10/10 20:48:18 $
 * Copyright 2008,2014 All rights reserved. NBS Payment Solutions Inc.
 *
 ****************************************************************************************/

package com.designpattern.observer;

/**
 * @author dchoi@nbsps.com
 *
 */
public class ObserverDemo {

    public static void main(String[] args) {
        
        Subject sub = new Subject();
        MobileObserver mobile = new MobileObserver(sub);
        WebObserver web = new WebObserver(sub);
        
        sub.setTemperature(2);
        sub.setTemperature(3);
        
        
    }
}
