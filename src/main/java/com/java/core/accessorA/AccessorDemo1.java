package com.java.core.accessorA;

public class AccessorDemo1 extends AccessorA {

	public AccessorDemo1() {
//		String test1 = privateStr; // private no way. you can not access
		String test2 = defaultStr; //Default you can access within same package
		String test3 = protectedStr; //Protected variable, you can access as long as inherit
		
		
		
		
	}

}
