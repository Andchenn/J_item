package com.ListDome;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShuffleDome1
{
	
	public static void main(String[] args)
	{
		String[] d={"hello","every","你好"};
		List<String> list= Arrays.asList(d); //创建一个动态数组对象
		//使用Collections类的shuffle方法对list随机排序
		Collections.shuffle(list);
		System.out.println(list);
		
		
	}
}
