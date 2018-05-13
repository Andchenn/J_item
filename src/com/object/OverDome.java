package com.object;

class Circle
{
	double radius,area;
	
	void setRadius(double r)
	{
		radius=r;
	}
	
	double getArea()
	{
		area=3.14*radius*radius;
		return area;
	}
}

class Ladder1
{
	double top,bottom,height;
	
	public Ladder1(double t,double b,double h)
	{
		top=t;
		bottom=b;
		height=h;
	}
	
	double getArea()
	{
		return (top+bottom)*height/2;
	}
}

class People
{
	double computerArea(Circle c)
	{
		return c.getArea();
	}
	
	double computerArea(Ladder1 l)
	{
	return l.getArea();
	}
}

public class OverDome
{
	public static void main(String[] args)
	{
		Circle circle=new Circle();
		circle.setRadius(5);
		
		Ladder1 ladder1=new Ladder1(10,20,5);
		
		
		People people=new People();
		
		System.out.println("people计算圆的面积："+people.computerArea(circle));
		System.out.println("people计算梯形面积："+people.computerArea(ladder1));
	}
}
