package com.array;

import java.util.Arrays;

public class Test3
{
	public static void main(String[] args)
	{
		int[] c=new int[5];
		int[] d=new int[5];
		Arrays.fill(c,1);
		Arrays.fill(d,2,4,20);
		if (Arrays.equals(c,d))
		{
			System.out.println("两个数组相等");
		}else {
			System.out.println("两数组不相等");
		}
	}
}
