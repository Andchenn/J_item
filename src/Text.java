public class Text
{
	public static void main(String[] args)
	{
		int i,j,k;
		
		for(i='X';i<='Z';i++)
		{
			for(j='X';j<='Z';j++)
			{
				for(k='X';k<='Z';k++)
				{
					if(i=='X'||j==i||k=='X'||k=='Z'||k==i||k==j) continue;
					System.out.println("Rivals of A, B and C are: "+(char)i+" "+(char)j+" "+(char)k);
				}
			}
		}
		
		
	}
}
