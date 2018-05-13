package com.ThreadDome;

public class House implements Runnable
{
	int cake;
	
	public void setCake(int c)
	{
		this.cake = c;
	}
	
	@Override
	public void run()
	{
		int m=2;
		while (true)
		{
			if (cake<=0)
			{
				System.out.println(Thread.currentThread().getName()+"进入死亡状态");
				return;
			}
			cake=cake-m;
			System.out.println(Thread.currentThread().getName()+"吃了"+m+"克蛋糕");
			System.out.println(Thread.currentThread().getName()+"发现蛋糕还剩下"+cake+"克");
			
			try
			{
				Thread.sleep(1000);
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	
	}
}
