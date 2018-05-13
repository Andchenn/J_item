package com.extend;
//继承与多态
class Car
{
	void cautionSound()
	{
		int a;
		double b;
		System.out.println("Hello!");
	}
}

class policeCar extends Car
{
	@Override
	void cautionSound()
	{
		System.out.println("zhou...zhou...zhou");
	}
}

class AmbulanCar extends Car
{
	@Override
	void cautionSound()
	{
		System.out.println("jiu...jiu...jiu");
	}
}

class FireCar extends Car
{
	@Override
	void cautionSound()
	{
		System.out.println("huo...huo...huo");
	}
}
public class CarDome
{
	public static void main(String[] args)
	{
		Car car=new policeCar();
		car.cautionSound();
		car = new AmbulanCar();
		car.cautionSound();
		car=new FireCar();
		car.cautionSound();
	}
}
