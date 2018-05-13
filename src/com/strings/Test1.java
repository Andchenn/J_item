package com.strings;

public class Test1
{
	public static void main(String[] args)
	{
		String s="123456";
		int i=Integer.parseInt(s);
		System.out.println(i);
		
		String s1="12.78";
		double l=Double.parseDouble(s1);
		System.out.println(l);
		
		int a=123;
		double d=12.3;
		System.out.println(String.valueOf(a));
		System.out.println(String.valueOf(d));
		
		String s2="hello world";
		char[] c=s2.toCharArray();
		for (int j = 0; j < c.length; j++)
		{
			System.out.println(c[j]);
		}
	}
}
