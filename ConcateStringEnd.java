import java.util.Scanner;

class ConcateStringEnd
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
		String val="";
		
		val+=name.charAt(name.length()-1);
		for(int i=0;i<name.length()-1;i++)
		{
				val+=name.charAt(i);
		
		}
		
		System.out.println(val);
	}	
}