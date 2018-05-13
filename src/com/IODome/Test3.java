package com.IODome;

import java.io.*;

public class Test3
{
	public static void main(String[] args)
	{
		String[] content={"1","2","3","4"};
		File file=new File("file.txt");
		
		try
		{
			FileWriter fw=new FileWriter(file);
			BufferedWriter bw=new BufferedWriter(fw);
			//遍历
			for (String str:content)
			{
				bw.write(str);
				bw.newLine();//换行
				
			}
			bw.close();
			fw.close();
			
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			String s=null;
			while ((s=br.readLine())!=null)
			{
				System.out.println(s);
			}
			
			br.close();
			fr.close();
			
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
