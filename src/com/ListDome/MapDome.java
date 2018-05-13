package com.ListDome;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDome
{
	public static void main(String[] args)
	{
		
		Map<String, String> map = new HashMap<>();
		map.put("1", "a");
		map.put("2", "s");
		map.put("3", "d");
		
		//第一种：普遍使用，第二取值
		System.out.println("通过map.keyset遍历key和vaule：");
		for (String key : map.keySet())
		{
			System.out.println("key=" + key + " and value=" + map.get(key));
		}
		
		
		//第二种：
		System.out.println("通过map。entryset使用iterator遍历key和value：");
		//迭代器只针对集合类型的数据，因此map类型的必须先转换成集合类型才能使用迭代器去获取元素。
		Iterator<Map.Entry<String, String>> it = map.entrySet().iterator(); //map.entrySet().iterator()是去获得这个集合的迭代器，保存在iter里面。。
		while (it.hasNext())
		{
			Map.Entry<String, String> entry = it.next();//就能获得map中的每一个键值对了  //Map.Entry接口
			System.out.println("key=" + entry.getKey() + " and value=" + entry.getValue());
		}
		
		
		//第三种，推荐，尤其容量大时
		System.out.println("通过map。entryset遍历key和value");
		for (Map.Entry<String, String> entry : map.entrySet())
		{
			System.out.println("key=" + entry.getKey() + " and value=" + entry.getValue());
		}
		
		
		//第四种
		System.out.println("通过map.values()遍历所有的value，但不能遍历key：");
		for (String v : map.values())
		{
			System.out.println("value=" + v);
		}
		
	}
}

//获得map的迭代器，用作遍历map中的每一个键值对
/*
Iterator是迭代器，map之前应该定义过，姑且认为是HashMap。
<Entry<String,String>>表示map中的键值对都是String类型的。
		map.entrySet()是把HashMap类型的数据转换成集合类型
		map.entrySet().iterator()是去获得这个集合的迭代器，保存在iter里面。。
		迭代器这么用：
		
		Iterator<String> iter;//声明一个迭代器，泛型里面是String类型，表示迭代元素是String类型的
Iterator<Entry<String,String>> iter;//而你提供的要稍微复杂一点，迭代元素本身就是一个Entry键值对，
Entry<String,String>表示其key值是String，value值也是String。
		
		HashSet set=map.entrySet();//将map类型数据转换成集合set类型的。
iter=set.iterator();//获得集合的迭代器。迭代器只针对集合类型的数据，
因此map类型的必须先转换成集合类型才能使用迭代器去获取元素。

keySet获得的只是key值的集合，
values获得的是value集合，
entryset获得的是键值对的集合。

it.hasNext()分为两个：it 和  .hasNext();
1. it:这里应该是上文定义了一个可迭代对象
2. .hasNext(): 检查序列中是否还有元素

3. 其他Iterator用法。
1)使用方法 iterator()要求容器返回一个 Iterator。第一次调用Iterator 的next()方法时，它返回序列的第一个元素。
2)使用next()获得序列中的下一个元素。
3)使用hasNext()检查序列中是否还有元素。
4)使用remove()将上一次返回的元素从迭代器中移除。

常用：
Map map=new HashMap();
Iterator iterator=Map.EntrySet().iterator();
while(iterator.hasNest())
{
Map.Entry entry=it.next()；
system.out.println(entry.getKey());
system.out.println(entry.getValue());
}

*/

