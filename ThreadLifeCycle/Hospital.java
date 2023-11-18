package com.kn.ThreadLifeCycle;

public class Hospital 
{
	public static void main(String[] args) 
	{
		Treatment t=new Treatment();
		Thread t1=new Thread(t);
		Thread t2=new Thread(t);
		t1.setName("Tom");
		t2.setName("Jerry");
		t1.start();
		t2.start();
		
	}
}
