/****************************************************************************************
 * $RCSfile: eclipse-codetemplates.xml,v $  $Revision: 1.4 $  $Date: 2014/10/10 20:48:18 $
 * Copyright 2008,2014 All rights reserved. NBS Payment Solutions Inc.
 *
 ****************************************************************************************/

package com.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Main Subject class who can notify changes to subscribers(observer) like messsaging system
 * @author dchoi@nbsps.com
 *
 */
public class Subject {
    private List<Observer2> observerLists = new ArrayList<Observer2>();
    private int temperature;
    
    public int getTemperature() {
        return temperature;
    }

    
    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifiyChanges();
    }

    public void subscribe(Observer2 obj) {
        observerLists.add(obj);
    }
    
    private void notifiyChanges() {
        for(Observer2 obj : observerLists) {
            obj.update(getTemperature());
        }
    }

}
