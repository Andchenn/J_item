package com.ThreadDome;

import java.lang.reflect.Member;

public class Bank implements Runnable
{
	int money;
	
	public void setMoney(int n)
	{
		money=n;
	}
	@Override
	public void run()
	{
		if (Thread.currentThread().getName().equals("会计"))
		{
			saveOrTake(300);
		}else if (Thread.currentThread().getName().equals("出纳")){
			saveOrTake(150);
		}
	}
	
	public synchronized void saveOrTake(int m)
	{
		if (Thread.currentThread().getName().equals("会计"))
		{
			for (int i = 0; i < 3; i++)
			{
				money=money+m/3;
				System.out.println(Thread.currentThread().getName()+"存入"+m/3+",账号还有"+money+",休息一段时间再存");
				try
				{
					Thread.sleep(1000);
				} catch (InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		}else if (Thread.currentThread().getName().equals("出纳"))
		{
			for (int i = 0; i < 3; i++)
			{
				money=money-m/3;
				System.out.println(Thread.currentThread().getName()+"取出"+m/3+",账号还有"+money+",休息一段时间在取");
				
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
}
