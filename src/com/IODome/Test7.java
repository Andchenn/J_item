package com.IODome;

import java.util.Scanner;

public class Test7
{
	public static void main(String[] args)
	{
		System.out.println("输入数字：");
		System.out.println("输入非数字结束：");
		Scanner sc=new Scanner(System.in);
		double sum=0;
		int n=0;
		while (sc.hasNextDouble())
		{
			double x=sc.nextDouble();
			n=n+1;
			sum=sum+x;
			
		}
		System.out.println(n+"个数的和："+sum);
		System.out.println(n+"个数的平均值："+sum/n);
	}
}
