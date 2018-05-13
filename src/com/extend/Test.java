package com.extend;

class A
{
	//表示问候的公共方法
	public void sayHello()
	{
		System.out.println("Hello,everyone!");
	}
	//表示道别的公共方法
	public void sayBye()
	{
		System.out.println("GoodBye,everyone!");
	}
}
class B extends A
{
	@Override
	public void sayHello()
	{
		System.out.println("大家早上好！");//输入中文问候
	}
}
public class Test
{
	public static void main(String[] args)
	{
		B b=new B();//创建子类B的一个实例对象，使用默认构造方法
		b.sayHello();//调用重写方法
		b.sayBye();//调用父类方法
	}
}
