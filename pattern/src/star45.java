
public class star45
{
	public static void main(String[] args) 
	{
		int i,j;
		int n=12,m=14;
		int mid=n/2;
		int mid2=m/2;
		for(i=1;i<n;i++)
		{
			for(j=1;j<m;j++)
			{
				if((i==mid) || (j==mid2))
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
