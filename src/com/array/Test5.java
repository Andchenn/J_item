package com.array;

public class Test5
{
	public static void main(String[] args)
	{
		int [] [] g={{1,2,3},{4,5,6},{7,8,9}};
		int [] [] g1=new int[3][3];
		int k=1;
		int i,j=0;
		for (int m = 0; m < g1.length; m++)
		{
			for (int n = 0; n < g1[m].length; n++)
			{
				g1[m][n]=k++;
			}
			System.out.print("输出a数组：");
			for (m = 0; m < g.length; m++)
			{
				for (int n = 0; n < g[m].length; n++)
				{
					System.out.print(g[m][n]+" ");
				}
				System.out.println();
			}
			System.out.print("输出b数量：");
			for (m = 0; m < g1.length; m++)
			{
				int n;
				for (n = 0; n < g1[m].length; n++)
				{
					System.out.print(g1[m][n]+" ");
				}
				System.out.println();
			}
		}
		
	}
}
