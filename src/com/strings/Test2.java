package com.strings;

public class Test2
{
	public static void main(String[] args)
	{
		StringBuffer buffer=new StringBuffer();
		buffer.append("我喜欢");
		buffer.append("你");
		
		StringBuffer buffer1=buffer.reverse();//倒换
		System.out.println(buffer.toString());
	}
}
