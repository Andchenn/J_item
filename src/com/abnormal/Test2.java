package com.abnormal;

public class Test2
{
	public static void throwOne() throws IllegalAccessException
	{
		System.out.println("在throwone中。");
		throw new IllegalAccessException("非法访问异常！");
	}
	public static void main(String[] args)
	{
		try//监视异常的发生
		{
			throwOne();
		}catch (IllegalAccessException e)//捕获并处理异常
		{
			System.out.println("捕获"+e);
		}
	}
}
