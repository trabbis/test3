package com.multithread1;

public class RegularClass {
	private int countDown = 1000000;
	private String className = "";
	
	private static int threadCount = 0;

	public RegularClass(String name) {
		//super("" + ++threadCount); // Store the thread name
		//start();
		this.className = name;
		//test1();
	}

	public String toString() {
//		return "#" + getName() + ": " + countDown;
		return "#" + className + ": " + countDown;
	}

	public void test1() {
		while (true) {
//			try {
//				Thread.sleep(100);
//			} catch (Exception e) {
//			}
			System.out.println(this);
			if (--countDown == 0)
				return;
		}
	}

	public static void main(String[] args) {
//		for (int i = 0; i <= 50; i++) {
//			new RegularClass(String.valueOf(i));
//		}
		
		RegularClass r1 = new RegularClass("1");
		RegularClass r2 = new RegularClass("2");
		RegularClass r3 = new RegularClass("3");
		RegularClass r4 = new RegularClass("4");
		RegularClass r5 = new RegularClass("5");
		RegularClass r6 = new RegularClass("6");
		RegularClass r7 = new RegularClass("7");
		RegularClass r8 = new RegularClass("8");
		RegularClass r9 = new RegularClass("9");
		RegularClass r10 = new RegularClass("10");
		
		r1.test1();
		r2.test1();
		r3.test1();
		r4.test1();
		r5.test1();
		r6.test1();
		r7.test1();
		r8.test1();
		r9.test1();
		r10.test1();
		
		
	}
	
} // /:~

