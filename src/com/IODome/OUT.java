package com.IODome;

import java.io.File;
import java.io.IOException;

public class OUT
{
	public static void main(String[] args) throws IOException
	{
		File dir=new File("\\root");
		File f1=new File(dir,"file.txt");
		if (!dir.exists())
		{
			dir.mkdir();
		}
		if (!dir.exists())
		{
			dir.createNewFile();
		}
		
		System.out.println("f1's path:"+f1.getAbsolutePath());
		System.out.println("f1 canread："+f1.canRead());
		System.out.println("f1 len:"+f1.length());
		String[] fl;
		int count=0;
		fl=dir.list();
		for (int i = 0; i < fl.length; i++)
		{
			count++;
			System.out.println(fl[i]+"is in \\root");
			
		}
		
		System.out.println("there are"+count+"file in \\root");
	}
}
