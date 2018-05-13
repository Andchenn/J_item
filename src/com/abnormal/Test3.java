package com.abnormal;

import java.util.Scanner;

public class Test3
{
	static int avg(int number1,int number2) throws MyException
	{
		if (number1<0||number2<0)
		{
			throw new MyException("不可以使用负数！");
		}
		if (number1>100||number2>100)
		{
			throw new MyException("数值太大！");
		}
		return (number1+number2)/2;
	}
	
	public static void main(String[] args)
	{
		System.out.println("求两个数的平均数！"+"请输入两个数，要求是都小于100的数：");
		Scanner in=new Scanner(System.in);
		int number1=in.nextInt();
		int number2=in.nextInt();
		try
		{
			int result=avg(number1,number2);
			System.out.println(result);
		} catch (MyException e)
		{
			System.out.println(e);
		}
	}
	
	private static class MyException extends Exception
	{
		public MyException(String ErrorMessage)
		{
			super(ErrorMessage);
		}
	}
}
