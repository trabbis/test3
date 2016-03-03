package com.multithread.deadlock2;

public class TestClient {

	public TestClient() {
		WorkA workA = new WorkA();
		WorkB workB = new WorkB();
		workA.setWorkB(workB);
		workB.setWorkA(workA);
		Thread thread1 = new Thread(new Thread1(workA,workB));
		Thread thread2 = new Thread(new Thread2(workA,workB));
		thread1.start();
		thread2.start();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
        new TestClient();
	}
}

class Thread1 implements Runnable {
	private WorkA workA;
	private WorkB workB;
	public Thread1(WorkA workA, WorkB workB) {
		this.workA = workA;
		this.workB = workB;
	}
	public void run() {
		for(int i=0;i<1000;i++) {
			System.out.println("Calling WorkA.method1()..." +i);
			this.workA.method1();
		}
	}
}

class Thread2 implements Runnable {
	private WorkA workA;
	private WorkB workB;
	public Thread2(WorkA workA, WorkB workB) {
		this.workA = workA;
		this.workB = workB;
	}
	public void run() {
		for(int i=0;i<1000;i++) {
			System.out.println("Calling WorkB.method3()..." +i);
			this.workB.method3();
		}
	}
}

