package com.kn.MultipleThreadsUsingSyncronized;

public class Jerry implements Runnable
{
	Hospital h;
	@Override
	public void run()
	{
		h.treatJerry();
	}
	public Jerry(Hospital h) {
		this.h = h;
	}
	
	
}
