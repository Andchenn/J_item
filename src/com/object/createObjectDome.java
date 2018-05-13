package com.object;

//创建类point，代表一个有着x的坐标和y的坐标
class Point
{
	public int x=0;
	public int y=0;
	public Point(int a,int b)
	{
		x=a;
		y=b;
	}
}

//创建类Rectangle，代表一个矩形
class Rectangle
{
	public int width=0;
	public int height=0;
	public Point origin;
	
	//4个构造方法
	public Rectangle()
	{
		origin=new Point(0,0);
	}
	
	public Rectangle(Point p)
	{
		origin=p;
	}
	
	public Rectangle(int w,int h)
	{
		origin=new Point(0,0);
		width=w;
		height=h;
	}
	public Rectangle(Point p,int w,int h)
	{
		origin=p;
		width=w;
		height=h;
	}
	//移动矩形的方法
	public void move(int x,int y)
	{
		origin.x=x;
		origin.y=y;
	}
	
	//计算矩形面积的方法
	public int getArea()
	{
		return width*height;
	}
}

public class createObjectDome
{
	public static void main(String[] args)
	{
		Point originOne=new Point(23,94);
		Rectangle rectOne=new Rectangle(originOne,100,200);
		Rectangle rectTwo=new Rectangle(50,100);
		System.out.println("RectOne的宽是："+rectOne.width);
		System.out.println("RectOne的高是："+rectOne.height);
		System.out.println("RectOne的面积是："+rectOne.getArea());
		
		rectTwo.origin=originOne;
		System.out.println("rectTwo的X坐标是："+rectTwo.origin.x);
		System.out.println("rectTwo的Y坐标是："+rectTwo.origin.y);
		
		rectTwo.move(40,72);
		System.out.println("rectTwo的X坐标是："+rectTwo.origin.x);
		System.out.println("rectTwo的Y坐标是："+rectTwo.origin.y);
		
		
	}
}
