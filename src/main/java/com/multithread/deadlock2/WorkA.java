package com.multithread.deadlock2;

public class WorkA {
	private WorkB workB;
    public void setWorkB(WorkB workB) {
    	this.workB = workB;
    }
    public synchronized void method1() {
    	workB.method2();
    }
    public synchronized void method4() {
    	System.out.println("Inside WorkA.method4....");
    }
}
