package com.kn.CreationOfThread;

public class MyThread extends Thread
{

	@Override
	public void run() //Task of Thread
	{
		Thread t1=Thread.currentThread();
		System.out.println(t1);
	}
	
}
