package com.generic;

class cat
{
	@Override
	public String toString()
	{
		return "我是一只猫";
	}
}

class Dog
{
	@Override
	public String toString()
	{
		return "我是一只狗";
	}
}

class showObject<E>
{
	public void showMess(E e)
	{
		System.out.println(e.toString());
	}
}

public class Dome1
{
	public static void main(String[] args)
	{
		showObject<cat> showCat = new showObject<>();
		showObject<Dog> showDog = new showObject<>();
		
		showCat.showMess(new cat());
		showDog.showMess(new Dog());
	}
}
