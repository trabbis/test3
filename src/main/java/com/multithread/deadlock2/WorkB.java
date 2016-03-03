package com.multithread.deadlock2;

public class WorkB {
    private WorkA workA;
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

