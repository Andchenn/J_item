package com.IODome;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFileDome
{
	
	public static void main(String[] args)
	{
		System.out.println("输入要保存文件的内容：");
		int count ,n=512;
		byte[] buffer=new byte[n];//定义存放读入信息的字节数组
		try
		{
			count=System.in.read(buffer);//读取标准输入符
			FileOutputStream os=new FileOutputStream("writeFile.txt");
			//把字节数组buffer中从下标0开始，长度为count的字节写入流中
			os.write(buffer,0,count);
			os.close();
			System.out.println("已保存到writeFile.txt！");
		} catch (IOException e)
		{
			System.out.println(e);
		}
	}
}
