package com.kn.DaemonThreading;

public class SavingCode extends Thread{

	@Override
	public void run() {
		for(;;) {
		System.out.println("Saving the Code");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}

}
