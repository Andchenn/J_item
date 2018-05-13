package com.object;

class Computer
{
	public int getSum(int...x)
	{
		int sum=0;
		for (int i = 0; i < x.length; i++)
		{
			sum=sum+x[i];
		}
		return sum;
	}
}

public class ComputerDome
{
	public static void main(String[] args)
	{
		Computer computer=new Computer();
		int result=computer.getSum(200,300,100);
		System.out.println("200,300,100之和："+result);
	}
}
