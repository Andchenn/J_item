package com.interfaces;

interface dog
{
	void run();
}

interface cat
{
	void sleep();
}

class Animal implements dog,cat
{
	
	@Override
	public void run()
	{
		System.out.println("run");
	}
	
	@Override
	public void sleep()
	{
		System.out.println("sleep");
	}
}


public class Test3
{
	public static void main(String[] args)
	{
		Animal animal=new Animal();
		animal.run();
		animal.sleep();
	}
}
