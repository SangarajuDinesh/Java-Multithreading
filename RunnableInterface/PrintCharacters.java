package com.kn.RunnableInterface;

public class PrintCharacters implements Runnable
{

	@Override
	public void run()
	{
		for(int i=65;i<=74;i++)
		{
			System.out.println((char)(i));
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
