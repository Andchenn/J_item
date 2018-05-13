package com.ThreadDome;

import com.sun.xml.internal.ws.util.Pool;

class Cake
{
	int size;
	
	public int getSize()
	{
		return size;
	}
	
	public void setSize(int n)
	{
		this.size = n;
	}
	public void lost(int m)
	{
		if (size-m>0)
		{
			size=size-m;
		}
	}
}

class Ant extends Thread
{
	Cake cake;
	
	public Ant(String name,Cake cake)
	{
		this.cake=cake;
		setName(name);//设置名字，红蚂蚁或黑蚂蚁
	}
	@Override
	public void run()
	{
	
		while (true)
		{
			int n=2;
			System.out.println(getName()+"吃"+n+"克蛋糕");
			cake.lost(n);
			System.out.println(getName()+"发现蛋糕还剩下"+cake.getSize()+"克");
			
			try
			{
				sleep(1000);
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			if (cake.getSize()<=0)
			{
				System.out.println(getName()+"已经进行死亡状态");
				return;
			}
		}
	}
}
public class ThreadDome
{
	public static void main(String[] args)
	{
		Cake cake=new Cake();
		int size=10;
		cake.setSize(size);
		System.out.println("蛋糕大小是"+size+"克");
		
		Ant antRed=new Ant("红蚂蚁",cake);
		Ant antblack=new Ant("黑蚂蚁",cake);
		
		antRed.start();
		antblack.start();
	}
	
	
}
