package com.generic;

class Panio{
	void play()
	{
		System.out.println("弹钢琴");
	}
}

class Violin
{
	void pull()
	{
		System.out.println("拉小提琴");
	}
}

interface Listen<E>{
	void Listen(E e);
}

class Student implements Listen<Panio>{
	
	@Override
	public void Listen(Panio e)
	{
		e.play();
	}
}

class Teacher implements Listen<Violin>
{
	
	@Override
	public void Listen(Violin e)
	{
		e.pull();
	}
}
public class Dome2
{
	public static void main(String[] args)
	{
		Student student=new Student();
		Teacher teacher=new Teacher();
		
		student.Listen(new Panio());
		teacher.Listen(new Violin());
	}
}
