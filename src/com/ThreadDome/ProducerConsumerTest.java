package com.ThreadDome;

import java.util.function.Consumer;

public class ProducerConsumerTest
{
	public static void main(String[] args)
	{
		CubbyHole c=new CubbyHole();
		Comsumer c1=new Comsumer(c,1);
		Producter p1=new Producter(c,1);
		
		c1.start();
		p1.start();
	}
	
	
	
}

class CubbyHole{
	private int contents;
	private boolean available=false;
	public synchronized int get()
	{
		while (available==false)
		{
			try
			{
				wait();
			} catch (InterruptedException e)
			{
			}
		}
		available=false;
		notifyAll();
		return contents;
	}
	
	public synchronized void put(int value)
	{
		while (available==true)
		{
			try
			{
				wait();
			} catch (InterruptedException e)
			{
			}
		}
		contents=value;
		available=true;
		notifyAll();
	}
}

class Comsumer extends Thread
{
	
	private CubbyHole cubbyHole;
	private int number;
	
	public Comsumer(CubbyHole c,int number)
	{
		cubbyHole=c;
		this.number=number;
	}
	@Override
	public void run()
	{
		int value=0;
		for (int i = 0; i < 10; i++)
		{
			value=cubbyHole.get();
			System.out.println("消费者#"+this.number+"got:"+value);
		}
	}
}

class Producter extends Thread
{
	
	private CubbyHole cubbyHole;
	private int number;
	
	public Producter(CubbyHole c,int number)
	{
		cubbyHole=c;
		this.number=number;
	}
	@Override
	public void run()
	{
		int value=0;
		for (int i = 0; i < 10; i++)
		{
			cubbyHole.put(i);
			System.out.println("生产者#"+this.number+"put:"+i);
			
			try
			{
				sleep((int)(Math.random()*100));
			} catch (InterruptedException e)
			{
			}
			
		}
	}
}