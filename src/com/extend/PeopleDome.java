package com.extend;

class Man extends People
{
	public String sex;
	
	public Man(int age, String name,String sex)
	{
		super(age, name);
		this.sex=sex;
	}
	
	public Man()
	{
	
	}
}

class Woman extends People
{
	
	public Woman(int age, String name)
	{
		super(age, name);
	}
	
	void say()
	{
		System.out.println("说话");
	}
}

public class PeopleDome
{
	public static void main(String[] args)
	{
		//PeopleDome peopleDome=new PeopleDome();
		People people=new People();
		people.name="张红";
		people.age=10;
		System.out.println("name:"+people.name);
		System.out.println("age:"+people.age);
		Man man=new Man();
		
		man.sex="女";
		System.out.println("sex:"+man.sex);
		
	}
}
