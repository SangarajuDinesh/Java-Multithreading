package com.kn.Instagram;

public class Reels extends Thread 
{

	@Override
	public void run()
	{
		try {
			System.out.println("Scrolling reels..");
			Thread.sleep(1000);
			System.out.println("Sharing reels");
			Thread.sleep(1000);
			System.out.println("Uploading the Reels");
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	
}
