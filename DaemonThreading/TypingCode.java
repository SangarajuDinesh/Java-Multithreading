package com.kn.DaemonThreading;

public class TypingCode extends Thread
{

	@Override
	public void run() {
		for(;;) {
		System.out.println("Typing the code");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
	
}
