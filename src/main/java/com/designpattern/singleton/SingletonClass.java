package com.designpattern.singleton;

public class SingletonClass {
	
	private static volatile SingletonClass instance = null;
	
	private SingletonClass() {
		
		//this.
		
	}
	
	public static SingletonClass getInstance() {
		if (instance == null) {
			instance = new SingletonClass();
		}
		return instance;
		
	}

}
