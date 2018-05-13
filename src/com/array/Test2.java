package com.array;

public class Test2
{
	public static void main(String[] args)
	{
		int[] a={1,2,3,4,5};
		int[] b={11,12,13,14,15};
		System.arraycopy(b,1,a,2,3);
		System.out.println("复制后a数组的值为");
		for (int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]+" ");
		}
	}
}
