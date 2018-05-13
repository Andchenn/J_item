package com.ExceptionDome;

public class NoSuchUserException extends Exception
{
	public NoSuchUserException()
	{
		super();
	}
	
	public NoSuchUserException(String message)
	{
		super(message);
	}
	
}
