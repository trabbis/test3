package com.multithread1;

//: c13:SimpleThread.java
//Very simple Threading example.
//From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
//www.BruceEckel.com. See copyright notice in CopyRight.txt.

public class SimpleThread extends Thread {
	private int countDown = 10;

	private static int threadCount = 0;

	public SimpleThread() {
		super("" + ++threadCount); // Store the thread name
		start();
	}

	public String toString() {
		return "#" + getName() + ": " + countDown;
	}

	public void run() {
		while (true) {
			System.out.println(this);
			if (--countDown == 0)
				return;
		}
	}

	public static void main(String[] args) {
		for (int i = 0; i < 50; i++)
			new SimpleThread();
	}
} // /:~

