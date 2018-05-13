package com.interfaces;


interface InterfaceA
{
	final int sum1=20;
	int getValue() ;
}

interface InterfaceB
{
	void say();
}

class InterfaceTest implements InterfaceA,InterfaceB{
	
	public int getValue()
	{
		System.out.println("实现getValue方法");
		return 2;
	}
	
	@Override
	public void say()
	{
		System.out.println("实现say方法");
	}
}
public class Test1
{
	public static void main(String[] args)
	{
		InterfaceTest obj=new InterfaceTest();
		obj.say();
		obj.getValue();
	}
}
