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
public class FolderProxy implements IFolder {

    Folder folder;
    User user;
    
    
    public FolderProxy(User user) {
        this.user = user;
    }
    
    public void performOperation() {
        if (user.getUserName().equalsIgnoreCase("duksun")) {
            folder = new Folder();
            folder.performOperation();
        } else {
            System.out.println("you are not allowed to access");
        }
        // TODO Auto-generated method stub
    }

}
