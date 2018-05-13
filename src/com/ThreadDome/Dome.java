package com.ThreadDome;


public class Dome
{
	public static void main(String[] args)
	{
		House house=new House();
		house.setCake(10);
		
		Thread antred=new Thread(house);
		antred.setName("红蚂蚁");
		
		Thread antblack=new Thread(house);
		antblack.setName("黑蚂蚁");
		
		antred.start();
		antblack.start();
	}
}
