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
public class WebObserver implements Observer2 {

    private Subject subject;
    
    public WebObserver(Subject sub) {
        this.subject = sub;
        this.subject.subscribe(this);
    }
    
    
    public void update(int temperature) {
        System.out.println("WebObserver..." + temperature);
        
    }

}
