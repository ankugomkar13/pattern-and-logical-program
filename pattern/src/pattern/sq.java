package pattern;

public class sq 
{
	public static void main(String[] args) 
	{
		int i,j;
		int n=8,m=8;
		int mid1 = n/2;
		int mid2 = m/2;
		for(i=1;i<n;i++)
		{
			for(j=1;j<m;j++)
			{
				if(i==j)
				{
					System.out.print(" o");
				}
				else
				{
					System.out.print(" *");
				}
			}
			System.out.println();
		}
	}
	}

