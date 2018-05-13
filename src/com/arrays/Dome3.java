package com.arrays;

import java.util.HashSet;
import java.util.Iterator;

//set不重复

public class Dome3
{
	public static void main(String[] args)
	{
		HashSet<String> hashSet=new HashSet<>();
		hashSet.add("我");
		hashSet.add("们");
		hashSet.add("是");
		hashSet.add("好");
		hashSet.add("朋");
		hashSet.add("友");
		
		Iterator<String> iterator=hashSet.iterator();
		while (iterator.hasNext())
		{
			String s1= (String) iterator.next();
			System.out.println(s1);
			
		}
	}
}
