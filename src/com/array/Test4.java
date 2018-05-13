package com.array;

import java.util.Arrays;

public class Test4
{
	public static void main(String[] args)
	{
		int [] e={12,62,45,85,32};//定义数组a
		int [] f={51,21,36,4,89};//定义数组b
		//将数组a全部排序
		Arrays.sort(e);
		//将数组b第2个和第4个之间排序
		Arrays.sort(f,2,4);
		System.out.println("数组e排序后：");
		for (int i = 0; i < e.length; i++)//循环输出a的元素
		{
			System.out.print(e[i]+" ");
			
		}
		System.out.println();
		System.out.println("数组f的排序：");
		for (int i = 0; i < f.length; i++)
		{
			System.out.println(f[i]+"");
		}
	}
}
