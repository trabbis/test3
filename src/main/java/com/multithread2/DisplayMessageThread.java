package com.multithread2;

public class DisplayMessageThread implements Runnable {

	private String message;
	public DisplayMessageThread(String message)
	{
		this.message = message;
	}
	
	public void run()
	{
		while(true)
		{
			System.out.println(message);
		}
	}

}
