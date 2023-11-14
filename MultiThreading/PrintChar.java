package com.kn.MultiThreading;

public class PrintChar extends Thread 
{

	@Override
	public void run() 
	{
		for(int i=65;i<=74;i++)
		{
			System.out.print((char)i+" ");
		}
	}
	
}
