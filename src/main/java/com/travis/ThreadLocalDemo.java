package com.travis;

public class ThreadLocalDemo extends Thread {

	  /** A serial number for clients */
	  private static int clientNum = 0;

	  /** This ThreadLocal holds the Client reference for each Thread */
	  private ThreadLocal myClient = new ThreadLocal() {
	    // The initialValue() method is called magically when you call get().
	    protected synchronized Object initialValue() {
	      return new Client(clientNum++);
	    }
	  };

	  private static int nonThreadLocalVariable = 99;
	  
	  public void run() {
		    System.out.println("Thread " + Thread.currentThread().getName() +
		  	      " has client " + myClient.get());
		    System.out.println("Thread " + Thread.currentThread().getName() +
			  	      " has client " + myClient.get());
		    try {
			    Thread.sleep(2000);
		    } catch (Exception e) {
		    }
		    System.out.println("Thread " + Thread.currentThread().getName() +
			  	      " has client " + myClient.get());
	    
//	    nonThreadLocal++;
	  }

	  public static void main(String[] args) {
	    Thread t1 = new ThreadLocalDemo();
	    Thread t2 = new ThreadLocalDemo();
	    Thread t3 = new ThreadLocalDemo();
	    t1.start();
	    t2.start();
	    t3.start();
	    
//	    System.out.println("Non threadlocal variable..." + nonThreadLocalVariable);
	    
	  }

	  /** Simple data class, in real life clients would have more fields! */
	  private class Client {

	    private int clNum;

	    Client(int n) {
	      clNum = n;
	    }

	    public String toString() {
	      return "Client[" + clNum + "]";
	    }
	  }
	} 


