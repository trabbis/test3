/****************************************************************************************
 * $RCSfile: eclipse-codetemplates.xml,v $  $Revision: 1.4 $  $Date: 2014/10/10 20:48:18 $
 * Copyright 2008,2014 All rights reserved. NBS Payment Solutions Inc.
 *
 ****************************************************************************************/

package com.designpattern.proxy;

/**
 * @author dchoi@nbsps.com
 *
 */
public class Folder implements IFolder {

    /* (non-Javadoc)
     * @see com.designpattern.proxy.IFolder#performOperation()
     */
    public void performOperation() {
        System.out.println("Real object is used");
        // TODO Auto-generated method stub
        
    }
    
}
