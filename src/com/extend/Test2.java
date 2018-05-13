package com.extend;

class a
{
	a()
	{
		System.out.println("我是a。");
	}
}
class b extends a{
	b()//子类的构造方法
	{
		super();//首先调用父类的构造方法
		System.out.println("我是b。");
	}
}
public class Test2
{
	public static void main(String[] args)
	{
		b b=new b();
	}
}
