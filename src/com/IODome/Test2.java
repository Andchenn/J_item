package com.IODome;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test2
{
	public static void main(String[] args)
	{
		String content="hello world!";
		File file=new File("you.txt");
		char[] c=content.toCharArray();
		try
		{
			FileWriter fw=new FileWriter(file);
			fw.write(c);
			fw.close();
			
			FileReader fr=new FileReader(file);
			char[] c1=new char[100];
			int count=0;
			while ((count=fr.read(c1))!=-1)
			{
				String s=new String(c1,0,count);
				System.out.println(s);
			}
			
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}
}
