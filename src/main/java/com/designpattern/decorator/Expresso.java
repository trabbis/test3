/****************************************************************************************
 * $RCSfile: eclipse-codetemplates.xml,v $  $Revision: 1.4 $  $Date: 2014/10/10 20:48:18 $
 * Copyright 2008,2014 All rights reserved. NBS Payment Solutions Inc.
 *
 ****************************************************************************************/

package com.designpattern.decorator;

/**
 * @author dchoi@nbsps.com
 *
 */
public class Expresso extends Beverage {
    
    public Expresso() {
        description = "Expresso";
    }

    @Override
    public double getCost() {
        return 1.0;
    }

}
