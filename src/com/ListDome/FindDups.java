package com.ListDome;

import java.util.HashSet;
import java.util.Set;

public class FindDups
{
	public static void main(String[] args)
	{
		//声明HashSet实例对象，使用泛型版本
		Set<String> set=new HashSet<>();
		//声明hashset实例对象，使用泛型版本
		Set<String> dups=new HashSet<>();
		for (String a:args)      //遍历命令行参数字符串数组
		{
			if (!set.add(a))   //如果a已经存在
			{
				dups.add(a);   //那么，将a添加到dups集合中
			}
			//破坏性的集合差
			set.removeAll(dups);
			System.out.println("不重复的单词："+set);
			System.out.println("重复单词："+dups);
		}
	}
}
