package com.IODome;

import java.io.*;

public class ObjetStream
{
	public static void main(String[] args)
	{
		ObjectOutputStream objectwriter = null;
		ObjectInputStream objectreader = null;
		
		try
		{
			objectwriter = new ObjectOutputStream(new FileOutputStream("student.sh"));
			objectwriter.writeObject(new Student("ff", 33));
			objectwriter.writeObject(new Student("tt", 45));
			objectwriter.writeObject(new Student("gg", 22));
			objectreader = new ObjectInputStream(new FileInputStream("student.sh"));
			
			for (int i = 0; i < 3; i++)
			{
				System.out.println(objectreader.readObject());
			}
		} catch (IOException | ClassNotFoundException e)
		{
			e.printStackTrace();
		} finally
		{
			try
			{
				objectreader.close();
				objectwriter.close();
			} catch (IOException e)
			{
				e.printStackTrace();
			}
			
		}
		
	}
	
}

class Student implements Serializable
{
	private String name;
	private int age;
	
	public Student(String name, int age)
	{
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString()
	{
		return "Student{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}

