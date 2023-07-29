
import java.util.Scanner;

class ReverseString
{

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String demo = sc.next();
		int num = demo.length();
		String rev = "";
		for(int i=num-1;i>=0; i--)
		{
			rev=rev+demo.charAt(i);
		
		}
		System.out.println(rev);

	}



}