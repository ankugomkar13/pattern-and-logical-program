
public class fib 
{
	public static void main(String[] args)
	{
		fib2(5);
		
	}
	public static void fib2(int n)
	{
		int i=1;
		int a=0;
		int b=1;
		int r;
		System.out.println(a);
		System.out.println(b);
		while(i<=n)
		{
			r=a+b;
			System.out.println(r);
			a=b;
			b=r;
			i++;
		}
	}
}
