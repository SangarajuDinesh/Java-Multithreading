package com.kn.MultiThreading;

public class ThreadDemo
{
	public static void main(String[] args)
	{
		PrintNum t1=new PrintNum();
		t1.start();
		PrintChar t2=new PrintChar();
		t2.start(); 
	}
}
