package com.kn.DaemonThreading;

public class CompilingCode extends Thread{

	@Override
	public void run() {
		for(;;) {
		System.out.println("Compiling the code");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}

}
