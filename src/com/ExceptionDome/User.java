package com.ExceptionDome;

import java.util.Scanner;

public class User
{
	
	String username;
	String password;
	
	public User(String username, String password)
	{
		this.username = "admin";
		this.password = "1234";
	}
	
	public static void CheakUser(String username,String password) throws NoSuchUserException, PasswordDontMatchException
	{
		if (!username.equals("admin"))
		{
			throw new NoSuchUserException("用户名不符");
		}else
		{
			if (!password.equals("1234"))
			{
				throw new PasswordDontMatchException("密码不符");
			}
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println("输入:");
		Scanner s=new Scanner(System.in);
		try
		{
			String str=s.next();
			System.out.println(str);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
