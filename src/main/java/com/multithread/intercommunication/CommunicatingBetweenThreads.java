package com.multithread.intercommunication;

/*
 * wait() ... thread is suspeneded until notify method is called
 * notify/notifyAll under synchronized method
 *  If your program seems to hang when using two or more threads, 
 * you should suspect that a deadlock has occurred. 
 *  A deadlock occurs when all threads in contention for a resource wait, 
 * thinking that another thread is using the resource when actually no thread 
 * is using it. Look for code where two threads access two synchronized objects.
 *  They could be doing this in an unusual sequence. Redesign your program to 
 * avoid this situation. A deadlock can also occur in a rare time-slicing 
 * sequence, where the operating system causes a circular dependency of two 
 * threads. ==> solved the problem
 * http://www.devarticles.com/c/a/Java/Multithreading-in-Java/8/
 * 
 */
public class CommunicatingBetweenThreads {

	public static void main(String args []) {
		Queue q = new Queue ();
		new Publisher (q);
		new Consumer (q);
	}
}

class Queue {
	int exchangeValue;
	boolean busy = false;
	
	synchronized int get() {
		//if not busy, just wait. Let the produce put the value
		if (!busy) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println(
						"Get: InterruptedException");
			}
		}
		
		//if busy, then consume the value
		System.out.println("Getting : " + exchangeValue);
		busy = false; //this line was missing from the original post. Tricky
		notify();
		return exchangeValue;
	}
	
	synchronized void put (int exchangeValue) {
		//if busy, just wait until value is consumed
		if (busy) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println(
						"Put: InterruptedException");
			}
			
		}
		
		//if not busy, then put the value
		this.exchangeValue = exchangeValue;
		busy = true;
		System.out.println("Putting : " + exchangeValue);
		notify();
		
	}
}

class Publisher implements Runnable {
	Queue q;
	Publisher(Queue q) {
		this.q = q;
		new Thread (this, "Publisher").start();
	}
	public void run() {
		for (int i = 0; i < 500; i++){
			q.put(i);
		}
	}
}

class Consumer implements Runnable {
	Queue  q;
	Consumer (Queue  q) {
		this.q = q;
		new Thread (this, "Consumer").start();
	}
	public void run() {
		for (int i = 0; i < 500; i++){
			q.get();
		}
	}
}
