package com.IODome;

import com.sun.org.apache.xpath.internal.operations.String;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.Buffer;


public class ReadFileDome
{
	public static void main(String[] args)
	{
		try
		{
			//创建文件输入流对象
			FileInputStream in=new FileInputStream("TestFile.sh");
			int n=512;          //设定读取的字节流
			byte buffer[]= new byte[n]; //读取输出流
			//读取n个字节，放置到以下标0开始字节数组butter中，返回值为实质读取的字节的数量
			while ((in.read(buffer,0,n)!=-1)&&(n>0))
			{
				System.out.println(new java.lang.String(buffer));
				System.out.println();
				in.close();
			}
		} catch (IOException e)
		{
			System.out.println(e);
			
		}
	}
}
