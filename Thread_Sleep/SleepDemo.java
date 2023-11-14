package com.kn.Thread_Sleep;

public class SleepDemo 
{
	public static void main(String[] args) 
	{
		PrintNumbers t1=new PrintNumbers();
		t1.start();
		PrintCharacters t2=new PrintCharacters();
		t2.start();
	}
}
