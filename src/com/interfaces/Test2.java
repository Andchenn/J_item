package com.interfaces;

interface one
{
	float PI=3.14f;
	float getArea();
	float getperimeter();//perimeter周长
}

interface two
{
	//float PI=3.14f;
	//float getArea();
	void draw();
}

class Circle implements one,two
{
	private float radius;
	
	public Circle(float r)
	{
		radius=r;
	}
	
	@Override
	public float getArea()
	{
		float area=radius*radius*one.PI;
		return area;
	}
	
	@Override
	public void draw()
	{
		System.out.println("绘制一个圆");
	}
	
	@Override
	public float getperimeter()
	{
		float perimeter=2*radius*one.PI;
		return perimeter;
	}
}
public class Test2
{
	public static void main(String[] args)
	{
		Circle c=new Circle(5);
		float area=c.getArea();
		System.out.println("圆面积:"+area);
		float perimeter=c.getperimeter();
		System.out.println("圆周长："+perimeter);
		c.draw();
	}
}
