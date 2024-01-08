
public class star9 
{
	public static void main(String[] args)
	{
		int i,j;
		for(i=0;i<7;i++)
		{
			for(j=0;j<7;j++)
			{
				if((i==3||j==7||i==7||j==3))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
	
				}
			}
			System.out.println();
  		 }
	}
}

