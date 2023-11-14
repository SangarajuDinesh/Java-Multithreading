package com.kn.Instagram;

public class InstagramApp
{
	public static void main(String[] args) 
	{
		System.out.println("Instagram Application has Started..");
		Chatting chatting=new Chatting();
		chatting.start();
		Reels reels=new Reels();
		reels.start();
		try {
		chatting.join();
		reels.join();
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("Instagram Application has Ended..");
	}
}
