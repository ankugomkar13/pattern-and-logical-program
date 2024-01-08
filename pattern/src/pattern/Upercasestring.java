package pattern;

public class Upercasestring 
{
	public static void main(String[] args) 
	{
		String str = "SOFTRONIX training";
		String lowercase = "";
		String uppercase = "";
		int length = (str.length())/2;
		System.out.println(length);
		char ch[]=str.toCharArray();
		for(int i=0;i<=length;i++)
		{
			if(ch[i]>='A' && ch[i]<='Z')
			{
			 String str1 =String.valueOf(ch[i]);
			 lowercase =  lowercase+str1.toLowerCase();
//			 System.out.println(lowercase);
			}
		}
		System.out.println(lowercase);
		for(int i=length;i<ch.length;i++)
		{
			if(ch[i]>='a' && ch[i]<='z')
			{
			 String str2 =String.valueOf(ch[i]);
			 uppercase = uppercase+str2.toUpperCase();
			}
		
		}
		System.out.println( uppercase);
		System.out.println(lowercase+""+ uppercase );
	}}

