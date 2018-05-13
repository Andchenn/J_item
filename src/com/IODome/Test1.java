package com.IODome;

import java.io.File;
import java.io.FileFilter;

public class Test1
{
	public static void main(String[] args)
	{
		File file=new File("home\\IdeaProjects\\shell.sh");
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.length());
		
		File file1=new File("hello.sh");
		file1.mkdir();
	}
}
