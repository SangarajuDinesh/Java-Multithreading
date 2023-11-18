package com.kn.ThreadLifeCycle;

public class Treatment implements Runnable
{
	@Override
	synchronized public void run() 
	{
		try {
		System.out.println("Treatment Started.. for "+Thread.currentThread().getName());
		Thread.sleep(2000);
		System.out.println("Treatment In-Progress.. for "+Thread.currentThread().getName());
		Thread.sleep(2000);
		System.out.println("Treatment Completed.. for "+Thread.currentThread().getName());
		Thread.sleep(2000);
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
	}
}
