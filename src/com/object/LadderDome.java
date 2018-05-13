package com.object;


class Ladder
{
	double top;         //实例变量
	static double bottom;//类变量
	
	public double getTop()
	{
		return top;
	}
	
	public static double getBottom()
	{
		return bottom;
	}
	
	public void setTop(double top)
	{
		this.top = top;
	}
	
	public static void setBottom(double bottom)
	{
		Ladder.bottom = bottom;
	}
}

public class LadderDome
{
	public static void main(String[] args)
	{
		Ladder.bottom=100;
		Ladder ladder1=new Ladder();
		Ladder ladder2=new Ladder();
		ladder1.setTop(50);
		ladder2.setTop(60);
		System.out.println("ladder1的上底："+ladder1.getTop());
		System.out.println("ladder2的上底："+ladder2.getTop());
		System.out.println("ladder1的下底："+Ladder.getBottom());
		System.out.println("ladder2的下底："+Ladder.getBottom());
		
	}
}
