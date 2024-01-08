import java.util.Scanner;

public class Febonaci 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of Febonacci =");
		int n=sc.nextInt();
		int i=1;
		while(i<n)
		{
			int a=0,b=1;
			System.out.println("Febocassi series = "+a);
			int c=a+b;
			//System.out.println("Febocassi series = "+a);
			a=b;
			b=c;
			i++;
		}
	}
}
