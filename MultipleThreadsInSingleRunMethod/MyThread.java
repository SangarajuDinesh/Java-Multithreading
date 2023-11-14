package com.kn.MultipleThreadsInSingleRunMethod;

public class MyThread extends Thread
{

	@Override
	public void run() 
	{
		if(Thread.currentThread().getName().equalsIgnoreCase("Numbers"))
		{
			printNumbers();
		}
		else {
			printCharacters();
			
		}
	}
	public void printNumbers() 
	{
		System.out.println("Printing Numbers started");
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		System.out.println("Printing Numbers Ended");
	}
	public void printCharacters() 
	{
		System.out.println("Printing Characters started");
		for(int i=65;i<=74;i++)
		{
			System.out.println((char)(i));
		}
		System.out.println("Printing Charaters Ended");
	}
	
}
