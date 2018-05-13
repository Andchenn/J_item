package com.ListDome;

public class StringSplit
{
	public static void main(String[] args)
	{
		String s="hello";
		String[] str=s.split("dd");//split分开，分歧//regex：正则表达式，表达对象
		for (String s1:str)
		{
			System.out.println(s1);
		}
	}
}
