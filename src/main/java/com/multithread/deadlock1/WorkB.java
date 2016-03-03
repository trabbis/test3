package com.multithread.deadlock1;

public class WorkB {
    private WorkA workA;
    private final static WorkB workB = new WorkB();
    private WorkB() {
    	
    }
    public static WorkB getInstance() {
    	return workB;
    }
    public void setWorkA(WorkA workA) {
    	this.workA = workA;
    }
    public synchronized void method2() {
    	System.out.println("Inside WorkB.method2....");
    }
    public synchronized void method3() {
    	workA.method4();
    }
}