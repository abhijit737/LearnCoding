import java.util.Scanner;


class ReverseString2
{
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int num = name.length();
		String rev="";
		
		for(int i=num-1; i>=0; i--)
		{
			rev = rev+name.charAt(i);
		
		}
		System.out.println(rev);
	}


}