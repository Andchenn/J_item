package com.TreeSetDemo;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest
{
	private static String[] studentNames={"张三","李四","王五","小刘","小七"};
	
	public static void main(String[] args)
	{
		TreeSet names=new TreeSet(Arrays.asList(studentNames));
		Iterator iter=names.iterator();
		while (iter.hasNext())
		{
			System.out.print(iter.next()+" ");
		}
		System.out.println();
		
		//按新方法添加元素到集合中,排列结果相同
		names=new TreeSet();
		int i=studentNames.length-1;
		for (;i>=0;i--)
		{
			names.add(studentNames[i]);
		}
		iter=names.iterator();
		while (iter.hasNext())
		{
			System.out.print(iter.next()+" ");
		}
	}
}
