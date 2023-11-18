package com.kn.DeadLock;

public class Hospital
{
	String res1="Doctor";
	String res2="Bed";
	public void treatTom()
	{
		try {
			synchronized (res1)
			{
				System.out.println("Treatment started for Tom using "+res1);
				Thread.sleep(2000);
				synchronized (res2)
				{
					System.out.println("Treatment started for Tom using "+res2);
					Thread.sleep(2000);
				}
			}
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	public void treatJerry()
	{
		try {
			synchronized (res2)
			{
				System.out.println("Treatment started for Jerry using "+res2);
				Thread.sleep(2000);
				synchronized (res1)
				{
					System.out.println("Treatment started for Jerry using "+res1);
					Thread.sleep(2000);
				}
			}
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
