package com.kn.MultipleThreadsInSingleRunMethod;

public class ThreadDemo 
{
	public static void main(String[] args)
	{
		MyThread m1=new MyThread();
		MyThread m2=new MyThread();
		m1.setName("numbers");
		m2.setName("Characters");
		m1.start();
		m2.start();
	}
}
