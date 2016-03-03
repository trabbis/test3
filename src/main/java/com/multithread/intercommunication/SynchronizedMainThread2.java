package com.multithread.intercommunication;

public class SynchronizedMainThread2 {

	public static void main (String args[]) {
	     Parentheses p3 = new Parentheses();
	     MyThread name1 = new MyThread(p3, "Bob");
	     MyThread name2 = new MyThread(p3, "Mary");
	     
	     try {
	        name1.t.join();
	        name2.t.join();
	     } catch (InterruptedException e ) {
	          System.out.println( "Interrupted");
	     }
	  }
	
}

class MyThread2 implements Runnable {
	String s1;
	Parentheses p1;
	Thread t;
	public MyThread2 (Parentheses p2, String s2) {
		p1= p2;
		s1= s2;
		t = new Thread(this);
		t.start();
	}
	public void run() {
		synchronized (p1) { //using synchronized statement
			p1.display(s1);
		}
	}
}

class Parentheses2 {
	//try with synchronized keyword or without it
	synchronized void display(String s) { 
		System.out.print ("(" + s);
		try {
			Thread.sleep (1000);
		} catch (InterruptedException e) {
			System.out.println ("Interrupted");
		}
		System.out.println(s + ")");
	}
}


