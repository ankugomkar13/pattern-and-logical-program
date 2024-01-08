package pattern;

public class string 
{
	public static void main(String[] args) 
	{
		String str ="@Softronix Traing#?!";
		System.out.println(str);
		int count=1;
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if((ch[i]>='A' && ch[i]<='Z')||(ch[i]>='a' && ch[i]<='z'))
			{
//				System.out.print(ch[i]);
				
			}
			else
			{
				System.out.print(ch[i]);
//				System.out.print(count++);
			}
		}
	}
	
		
}
