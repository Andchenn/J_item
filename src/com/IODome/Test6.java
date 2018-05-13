package com.IODome;

import java.io.IOException;

public class Test6
{
	public static void main(String[] args)
	{
		int a;
		System.out.print("输入字符：");
		try
		{
			a=(char)System.in.read();
			System.out.println("你输入的字符："+a);
		} catch (IOException e)
		{
		}
	}
}
