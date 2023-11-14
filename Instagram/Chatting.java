package com.kn.Instagram;

public class Chatting extends Thread
{

	@Override
	public void run()
	{
		try {
		System.out.println("Chatting Started...");
		Thread.sleep(1000);
		System.out.println("Chit Chatting...");
		Thread.sleep(1000);
		System.out.println("Chatting Ended...");
		Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	
}
