package com.extend;

public class People
{
	//定义两个属性
	int age;
	String name;
	
	public People(int age,String name)
	{
		this.age=age;
		this.name=name;
	}
	
	public People()
	{
	
	}
	
	public int getAge()//获得属性age的值
	{
		return age;
	}
	
	public void setAge(int age)//设置属性age的值
	{
		this.age = age;
	}
	
	public String getName()//设置属性nane的值
	{
		return name;
	}
	
	public void setName(String name)//设置属性name的值
	{
		this.name = name;
	}
}
