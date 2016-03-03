package com.multithread.deadlock1;

public class WorkA {
    private WorkB workB;
    private final static WorkA workA = new WorkA();
    private WorkA(){
	
    }
    public static WorkA getInstance() {
	return workA;
    }
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
