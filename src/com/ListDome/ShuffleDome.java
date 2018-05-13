package com.ListDome;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ShuffleDome
{
	public static void main(String[] args)
	{
		String[] s1={"jj","k"};
		List<String> list=new ArrayList<>();//创建一个动态数组对象
		for (String s:s1)  //循坏遍历命令行参数中的每一个元素
		{
			list.add(s);  //将元素添加到数组中
			//使用Collections类的shuffle方法对list随机排序
			Collections.shuffle(list,new Random());//shuffle随手放，洗牌; 曳脚而行; 搬移
			System.out.println(list);
		}
	}
}
