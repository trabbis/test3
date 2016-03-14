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
public class ProxyDemo {

    public static void main(String[] args) {
        User user = new User("duksun");
        FolderProxy folder = new FolderProxy(user);
        folder.performOperation();
        
        
        user = new User("not duksun");
        folder = new FolderProxy(user);
        folder.performOperation();
        
        
    }

}
