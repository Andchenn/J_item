package com.extend;

class Animal
{
	public static void testClassMethod()
	{
		System.out.println("Animal中的类方法。");//静态的类方法
	}
	public void testInstanceMethod()
	{
		System.out.println("Animal中的实例方法。");//定义实例方法
	}
}

class Cat extends Animal
{
	
	public static void testClassMethod()
	{
		System.out.println("Cat中的类方法。");
	}
	public void testInstanceMethod()
	{
		System.out.println("Cat中的实例方法。");
	}
}
public class Test1
{
	
	public static void main(String[] args)
	{
		Cat cat=new Cat();
		Animal animal=cat;//类型转换
		Animal.testClassMethod();
		animal.testClassMethod();
		Cat.testClassMethod();
		animal.testInstanceMethod();
		cat.testInstanceMethod();
		Animal animal1=new Animal();
		animal1.testInstanceMethod();
	}
}
