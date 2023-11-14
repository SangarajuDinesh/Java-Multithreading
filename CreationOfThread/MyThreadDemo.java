package com.kn.CreationOfThread;

public class MyThreadDemo 
{
	public static void main(String[] args)
	{
		Thread t1=Thread.currentThread();
		System.out.println(t1);
		MyThread mt=new MyThread();
		mt.start();
		mt.setName("MyThread");
		mt.setPriority(3);
	}
}
