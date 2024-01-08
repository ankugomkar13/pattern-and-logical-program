package pattern;

public class search 
{
	public static void main(String[] args) 
	{
		 try { int count=1;
		 String withoutspecial="";
		 String s="@softronix training#?!";
		
			for(int i=0;i<s.length();i++) {
				if(!Character.isDigit(s.charAt(i)) &&
					!Character.isLetter(s.charAt(i)) &&
					!Character.isWhitespace(s.charAt(i)))
				{
					System.out.print(" " +count++);
				}
				withoutspecial= withoutspecial+s.charAt(i);
				}

		} catch (Exception e) {
			e.printStackTrace();
		}	
	}

	}

