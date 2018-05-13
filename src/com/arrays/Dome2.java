package com.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Dome2
{
	public static void main(String[] args)
	{
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("1");
		hashSet.add("2");
		hashSet.add("3");
		
		Iterator<String> iterator = hashSet.iterator();
		while (iterator.hasNext())//迭代器进行遍历
		//往下扫描
		{
			String s = iterator.next();//得到下一个
			System.out.println(s);
		}
		
		System.out.println();
		
		HashMap<String, String> hashMap = new HashMap<>();
		hashMap.put("name", "tom");
		hashMap.put("age", "18");
		System.out.println(hashMap.get("age"));
		
		
	}
}
