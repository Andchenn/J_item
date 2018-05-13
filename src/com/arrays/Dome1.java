package com.arrays;

import java.util.ArrayList;
import java.util.LinkedList;

public class Dome1
{
	public static void main(String[] args)
	{
		ArrayList<Integer> arrayList=new ArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		
		for (int i = 0; i < arrayList.size(); i++)
		{
			int t=(int)arrayList.get(i);
			System.out.println(t);
		}
		
		
		
		LinkedList<String> linkedList=new LinkedList<>();
		linkedList.add("我");
		linkedList.add("爱");
		linkedList.add("你");
		linkedList.addFirst("feng");

		
		for (int i = 0; i < linkedList.size(); i++)
		{
			String s=(String)linkedList.get(i);
			System.out.println(s);
		}
	}
	
}
