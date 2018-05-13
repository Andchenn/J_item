package com.IODome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Text5
{
	public static void main(String[] args) throws IOException
	{
		float number;
		System.out.println("enter a number");
		
		try
		{
			//InputStreamReader in=new InputStreamReader(System.in);
			//BufferedReader br=new BufferedReader(in);
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			String a=br.readLine();
			number=Float.valueOf(a);
			int x=(int)number;
			
			System.out.println("you input:"+number);
			System.out.println("your input in integer terms is "+x);
			
		} catch (IOException e)
		{
		
		}
	}
}
