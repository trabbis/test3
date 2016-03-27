package com.designpattern.singleton;

public class SingletonDemo {

	public static void main(String[] args) {
		//Obviously you can not create new instance
//		SingletonClass test1 = new SingletonClass();
	
		SingletonClass test2 = SingletonClass.getInstance();
		
		//test2.clone();
		
		
	}

}
