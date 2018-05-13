package com.IODome;

import com.sun.org.apache.xpath.internal.operations.String;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;


public class Test4
{
	public static void main(String[] args) throws IOException
	{
		FileReader fr=new FileReader("you.txt");
		int c=fr.read();
		while (c!=-1)
		{
			System.out.println((char)c);
			c=fr.read();
		}
		fr.close();
	}
}
