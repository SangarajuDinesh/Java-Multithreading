package com.kn.DaemonThreading;

public class DaemonThread 
{
	public static void main(String[] args)
	{
		TypingCode tc=new TypingCode();
		CompilingCode cc=new CompilingCode();
		SavingCode Sc=new SavingCode();
		cc.setDaemon(true);
		Sc.setDaemon(true);
		tc.start();
		cc.start();
		Sc.start();
	}
}
