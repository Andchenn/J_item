package com.IODome;

import java.io.DataInputStream;
import java.io.IOException;

public class Reading
{
	public static void main(String[] args)
	{
		DataInputStream  dis=new DataInputStream(System.in);
		int intnumber=0;
		float floatnumber=0.0f;
		
		try
		{
			System.out.println("enter an integer:");
			intnumber=Integer.parseInt(dis.readLine());
			
			System.out.println("enter an floatnumber: ");
			floatnumber=Float.parseFloat(dis.readLine());
			
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
