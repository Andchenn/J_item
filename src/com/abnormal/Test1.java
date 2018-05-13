package com.abnormal;

public class Test1
{
	public static void main(String[] args)
	{
		
		int datas1[]={2,4,6,8,10,12};
		int datas2[]={1,0,2,4,3};
		try
		{
			for (int i = 0; i < datas1.length; i++)
			{
				try
				{
					System.out.println(datas1[i]+"/"+datas2[i]+"is"+datas1[i]/datas2[i]);
				}catch (ArithmeticException e)
				{
					System.out.println("不能被整除！");
				}
				
			}
		}catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("程序被终止！");
		}
		
	}
}
