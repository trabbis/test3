package com.java.core.accessorB;

import com.java.core.accessorA.AccessorA;

public class AccessorDemo2 extends AccessorA{
	
	public AccessorDemo2() {
//		String test1 = privateStr; // private no way. you can not access at all
//		String test2 = defaultStr; //Default you can access only within same package
		String test3 = protectedStr; //Protected variable, you can access as long as you subclass
		
		
	}
	

}
