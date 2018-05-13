package com.ExceptionDome;

import sun.java2d.Surface;

public class PasswordDontMatchException extends Exception
{
	public PasswordDontMatchException()
	{
		super();
	}
	
	public PasswordDontMatchException(String message)
	{
		super(message);
	}
}
