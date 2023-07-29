import java.util.Scanner;

class RevStringExample
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string to reverse");
		String name = sc.nextLine();
		int len = name.length();
		
		char [] ch = name.toCharArray();
		for(int i=len-1; i>=0;i--)
		{
			
			System.out.print(ch[i]);


		}

	}

}