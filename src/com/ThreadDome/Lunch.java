package com.ThreadDome;

public class Lunch
{
	private long m1=0;
	private long m2=0;
	private Object lock1=new Object();
	private Object lock2=new Object();
	public void addm1()
	{
		synchronized (lock1)
		{
			m1++;
		}
	}
	public void addm2()
	{
		synchronized (lock2)
		{
			m2++;
		}
	}
}
