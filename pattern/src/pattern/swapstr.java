package pattern;

public class swapstr 
{
	public static void main(String[] args)
	{ 
		try {
			String str = "SOFTRONIX training";
			char ch[]=str.toCharArray();
			char temp;
			for(int i=0;i<ch.length;i++)
			{
				temp=ch[0];
				ch[0]=ch[ch.length-1];
				ch[ch.length-1]=temp;
//				System.out.print(ch[i]);
				String str1 =String.valueOf(ch[i]);
				System.out.print(str1);
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}

}}