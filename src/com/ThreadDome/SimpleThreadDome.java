package com.ThreadDome;

import javax.swing.*;

public class SimpleThreadDome
{
	//显示信息，消息钱是当前线程的名字
	static void printThreadMessage(String message)
	{
		String threadName=Thread.currentThread().getName();
		//格式化输出线程信息
		System.out.format("%s:%s%n",threadName,message);
	}
	
	//私有静态内部类，实现runnable接口
	private static class MessageLoop implements Runnable
	{
		
		@Override
		public void run()
		{
			String info[]={"消息1","消息2","消息3","消息4"};
			try
			{
				for (int i = 0; i < info.length; i++)
				{
					Thread.sleep(4000);
					printThreadMessage(info[i]);
				}
			} catch (InterruptedException e)
			{
				printThreadMessage("不能正常工作");
			}
			
		}
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		//在中断messageLoop线程之前延迟的毫秒数（默认是一小时）
		long delay=1000*60*60;
		//如果有命令参数，那么在命令参数中给出延迟的时间
		if (args.length>0)
		{
			try
			{
				//将命令行中的第一各参数解析为整数（秒）
				delay=Long.parseLong(args[0])*1000;
			}catch (NumberFormatException e)
			{
				System.out.println("参数必须是整数");
				System.exit(1);
			}
		}
		printThreadMessage("启动MessageLoop线程...");
		long startTime=System.currentTimeMillis();//获得当前系统时间
		Thread t=new Thread(new MessageLoop());//创建线程t
		t.start();//启动线程t
		printThreadMessage("等待messageLoop线程结束...");
		//循环直到MessageLoop线程退出
		
		while (t.isAlive())
		{
			printThreadMessage("继续等待...");
			//等待一秒结束
			t.join(1000);
			//如果线程t运行的时间超过delay指定的时间
			if ((System.currentTimeMillis()-startTime)>	delay&&t.isAlive())
			{
				printThreadMessage("时间太长，不在等待");
				t.interrupt();
				t.join();
			}
		}
		printThreadMessage("线程结束！");
	}
}
