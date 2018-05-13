package com.enumDome;

public class Dome
{
	public static void main(String[] args)
	{
		/*for (season s:season.values())
		{
			System.out.println(s);
		}*/
		
		
		season s=season.summer;
		switch (s){
			case Spring:
				System.out.println("Spring");
				break;
			case summer:
				System.out.println("summer");
				break;
			case fall:
				System.out.println("fall");
				break;
			case winter:
				System.out.println("winter");
				break;
		}
	}
	public enum season
	{
		Spring,summer,fall,winter;
	}
}
