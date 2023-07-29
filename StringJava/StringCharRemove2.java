import java.util.Scanner;

class StringCharRemove2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String ");
		String str = sc.next();
		System.out.println("Enter Character ");
		char c =sc.next().charAt(0); 
		
		String Newstr = "";
		for(int i=0; i<str.length(); i++)
		{
			if( str.charAt(i) != c)
			{
			
				Newstr += str.charAt(i); 
			}
		
		
		}
		
	
		System.out.println(Newstr);
	
	}





}