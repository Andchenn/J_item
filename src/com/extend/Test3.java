package com.extend;

class User
{
	public int age;
	public String name;
	
	public User(int age,String name)
	{
		this.age=age;
		this.name=name;
	}
}

class Tom extends User{
	
	public String password;
	public Tom(int age, String name,String password)
	{
		super(age, name);
		this.password=password;
	}
	public void login()
	{
		System.out.println("登录");
	}
}
public class Test3
{
	public static void main(String[] args)
	{
		System.out.println();
	}
}
