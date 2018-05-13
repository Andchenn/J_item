package com.array;

import java.util.Arrays;

public class Test1
{
	public static void main(String[] args)
	{
		int[] a=new int[5];
		int[] b=new int[5];
		Arrays.fill(a,1);
		Arrays.fill(b,2,4,20);
		//循环输出数组元素
		
		for (int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < b.length; i++)
		{
			System.out.println(b[i]+" ");
		}
	}
}
