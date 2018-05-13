package com.ThreadDome;

public class SleepingThread extends Thread
{
	private static int threadCount = 0;
	private int countDown = 5;
	
	public SleepingThread()
	{
		super("" + ++threadCount);
		start();
	}
	
	@Override
	public String toString()
	{
		return "#" + getName() + ":" + countDown;
	}
	
	@Override
	public void run()
	{
		while (true)
		{
			System.out.println(this);
			if (--countDown==0)
			{
				return;
			}
			try
			{
				sleep(100);
			} catch (InterruptedException e)
			{
				throw new RuntimeException(e);
			}
		}
	}
	
	public static void main(String[] args)throws InterruptedException
	{
		for (int i = 0; i < 5; i++)
		{
			new SleepingThread().join();
			System.out.println("线程已挂起");
		}
	}
}