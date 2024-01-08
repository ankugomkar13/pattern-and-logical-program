package pattern;

public class searching 
{
	public static void main(String[] args)
	{
		int arr1[]={1,2,3,4,5,6,7,8,9,10};
		int arr2[]={1,2,3,4,6,7,8,9,10};
		int sum=0;
		int miss_num = 0;
		int sum2;
		int i,sum1;
		sum1=(10*11)/2;
		System.out.println("Sum of complete array "+ sum1);
		for(i=0;i<arr2.length;i++)
		{
			sum2 = sum+arr2[i];
			miss_num = sum1-sum2;
		}
		System.out.println("missing number = "+ miss_num);
		
		
	
	}

}
